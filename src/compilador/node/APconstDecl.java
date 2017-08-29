/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APconstDecl extends PPconstDecl
{
    private TTconst _tconst_;
    private PPconstDecl2 _pconstDecl2_;

    public APconstDecl()
    {
        // Constructor
    }

    public APconstDecl(
        @SuppressWarnings("hiding") TTconst _tconst_,
        @SuppressWarnings("hiding") PPconstDecl2 _pconstDecl2_)
    {
        // Constructor
        setTconst(_tconst_);

        setPconstDecl2(_pconstDecl2_);

    }

    @Override
    public Object clone()
    {
        return new APconstDecl(
            cloneNode(this._tconst_),
            cloneNode(this._pconstDecl2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPconstDecl(this);
    }

    public TTconst getTconst()
    {
        return this._tconst_;
    }

    public void setTconst(TTconst node)
    {
        if(this._tconst_ != null)
        {
            this._tconst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tconst_ = node;
    }

    public PPconstDecl2 getPconstDecl2()
    {
        return this._pconstDecl2_;
    }

    public void setPconstDecl2(PPconstDecl2 node)
    {
        if(this._pconstDecl2_ != null)
        {
            this._pconstDecl2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pconstDecl2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tconst_)
            + toString(this._pconstDecl2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tconst_ == child)
        {
            this._tconst_ = null;
            return;
        }

        if(this._pconstDecl2_ == child)
        {
            this._pconstDecl2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tconst_ == oldChild)
        {
            setTconst((TTconst) newChild);
            return;
        }

        if(this._pconstDecl2_ == oldChild)
        {
            setPconstDecl2((PPconstDecl2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
