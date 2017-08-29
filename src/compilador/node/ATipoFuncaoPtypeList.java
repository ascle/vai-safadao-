/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ATipoFuncaoPtypeList extends PPtypeList
{
    private PPfunctionptype _pfunctionptype_;

    public ATipoFuncaoPtypeList()
    {
        // Constructor
    }

    public ATipoFuncaoPtypeList(
        @SuppressWarnings("hiding") PPfunctionptype _pfunctionptype_)
    {
        // Constructor
        setPfunctionptype(_pfunctionptype_);

    }

    @Override
    public Object clone()
    {
        return new ATipoFuncaoPtypeList(
            cloneNode(this._pfunctionptype_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoFuncaoPtypeList(this);
    }

    public PPfunctionptype getPfunctionptype()
    {
        return this._pfunctionptype_;
    }

    public void setPfunctionptype(PPfunctionptype node)
    {
        if(this._pfunctionptype_ != null)
        {
            this._pfunctionptype_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pfunctionptype_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pfunctionptype_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pfunctionptype_ == child)
        {
            this._pfunctionptype_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pfunctionptype_ == oldChild)
        {
            setPfunctionptype((PPfunctionptype) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
