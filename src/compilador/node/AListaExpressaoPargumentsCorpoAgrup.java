/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AListaExpressaoPargumentsCorpoAgrup extends PPargumentsCorpoAgrup
{
    private PPexpressionList _pexpressionList_;

    public AListaExpressaoPargumentsCorpoAgrup()
    {
        // Constructor
    }

    public AListaExpressaoPargumentsCorpoAgrup(
        @SuppressWarnings("hiding") PPexpressionList _pexpressionList_)
    {
        // Constructor
        setPexpressionList(_pexpressionList_);

    }

    @Override
    public Object clone()
    {
        return new AListaExpressaoPargumentsCorpoAgrup(
            cloneNode(this._pexpressionList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaExpressaoPargumentsCorpoAgrup(this);
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
            + toString(this._pexpressionList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
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
        if(this._pexpressionList_ == oldChild)
        {
            setPexpressionList((PPexpressionList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}