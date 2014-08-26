/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class ACmpneBinop extends PBinop
{
    private TCmpne _cmpne_;

    public ACmpneBinop()
    {
        // Constructor
    }

    public ACmpneBinop(
        @SuppressWarnings("hiding") TCmpne _cmpne_)
    {
        // Constructor
        setCmpne(_cmpne_);

    }

    @Override
    public Object clone()
    {
        return new ACmpneBinop(
            cloneNode(this._cmpne_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACmpneBinop(this);
    }

    public TCmpne getCmpne()
    {
        return this._cmpne_;
    }

    public void setCmpne(TCmpne node)
    {
        if(this._cmpne_ != null)
        {
            this._cmpne_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cmpne_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cmpne_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cmpne_ == child)
        {
            this._cmpne_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cmpne_ == oldChild)
        {
            setCmpne((TCmpne) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}