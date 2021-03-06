package soot.tagkit;

/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 1997 - 2018 Feng Qian
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

import java.util.LinkedList;

import soot.G;
import soot.IdentityUnit;
import soot.Singletons;
import soot.Unit;

/** The aggregator for LineNumberTable attribute. */
public class LineNumberTagAggregator extends FirstTagAggregator {

  public LineNumberTagAggregator(Singletons.Global g) {
  }

  public static LineNumberTagAggregator v() {
    return G.v().soot_tagkit_LineNumberTagAggregator();
  }

  /** Decide whether this tag should be aggregated by this aggregator. */
  @Override
  public boolean wantTag(Tag t) {
    return (t instanceof LineNumberTag) || (t instanceof SourceLnPosTag);
  }

  @Override
  public String aggregatedName() {
    return "LineNumberTable";
  }

  @Override
  public void considerTag(Tag t, Unit u, LinkedList<Tag> tags, LinkedList<Unit> units) {
    // System.out.println("consider tag for unit: "+u.getClass());
    if (!(u instanceof IdentityUnit)) {
      super.considerTag(t, u, tags, units);
    }
  }
}
