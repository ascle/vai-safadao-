/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExpressaoPrimaPprimaryExpr extends PPprimaryExpr
{
    private PPoperand _poperand_;

    public AExpressaoPrimaPprimaryExpr()
    {
        // Constructor
    }

    public AExpressaoPrimaPprimaryExpr(
        @SuppressWarnings("hiding") PPoperand _poperand_)
    {
        // Constructor
        setPoperand(_poperand_);

    }

    @Override
    public Object clone()
    {
        return new AExpressaoPrimaPprimaryExpr(
            cloneNode(this._poperand_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpressaoPrimaPprimaryExpr(this);
    }

    public PPoperand getPoperand()
    {
        return this._poperand_;
    }

    public void setPoperand(PPoperand node)
    {
        if(this._poperand_ != null)
        {
            this._poperand_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._poperand_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._poperand_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._poperand_ == child)
        {
            this._poperand_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._poperand_ == oldChild)
        {
            setPoperand((PPoperand) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}