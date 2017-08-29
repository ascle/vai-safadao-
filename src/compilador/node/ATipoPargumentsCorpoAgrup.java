/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ATipoPargumentsCorpoAgrup extends PPargumentsCorpoAgrup
{
    private PPtype _ptype_;
    private TTvirgula _tvirgula_;
    private PPexpressionList _pexpressionList_;

    public ATipoPargumentsCorpoAgrup()
    {
        // Constructor
    }

    public ATipoPargumentsCorpoAgrup(
        @SuppressWarnings("hiding") PPtype _ptype_,
        @SuppressWarnings("hiding") TTvirgula _tvirgula_,
        @SuppressWarnings("hiding") PPexpressionList _pexpressionList_)
    {
        // Constructor
        setPtype(_ptype_);

        setTvirgula(_tvirgula_);

        setPexpressionList(_pexpressionList_);

    }

    @Override
    public Object clone()
    {
        return new ATipoPargumentsCorpoAgrup(
            cloneNode(this._ptype_),
            cloneNode(this._tvirgula_),
            cloneNode(this._pexpressionList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoPargumentsCorpoAgrup(this);
    }

    public PPtype getPtype()
    {
        return this._ptype_;
    }

    public void setPtype(PPtype node)
    {
        if(this._ptype_ != null)
        {
            this._ptype_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ptype_ = node;
    }

    public TTvirgula getTvirgula()
    {
        return this._tvirgula_;
    }

    public void setTvirgula(TTvirgula node)
    {
        if(this._tvirgula_ != null)
        {
            this._tvirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tvirgula_ = node;
    }

    public PPexpressionList getPexpressionList()
    {
        return this._pexpressionList_;
    }

    public void setPexpressionList(PPexpressionList node)
    {
        if(this._pexpressionList_ != null)
        {
            this._pexpressionList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pexpressionList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ptype_)
            + toString(this._tvirgula_)
            + toString(this._pexpressionList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ptype_ == child)
        {
            this._ptype_ = null;
            return;
        }

        if(this._tvirgula_ == child)
        {
            this._tvirgula_ = null;
            return;
        }

        if(this._pexpressionList_ == child)
        {
            this._pexpressionList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ptype_ == oldChild)
        {
            setPtype((PPtype) newChild);
            return;
        }

        if(this._tvirgula_ == oldChild)
        {
            setTvirgula((TTvirgula) newChild);
            return;
        }

        if(this._pexpressionList_ == oldChild)
        {
            setPexpressionList((PPexpressionList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}