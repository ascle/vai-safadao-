/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AValorLiteralPkey extends PPkey
{
    private PPliteralValue _pliteralValue_;

    public AValorLiteralPkey()
    {
        // Constructor
    }

    public AValorLiteralPkey(
        @SuppressWarnings("hiding") PPliteralValue _pliteralValue_)
    {
        // Constructor
        setPliteralValue(_pliteralValue_);

    }

    @Override
    public Object clone()
    {
        return new AValorLiteralPkey(
            cloneNode(this._pliteralValue_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAValorLiteralPkey(this);
    }

    public PPliteralValue getPliteralValue()
    {
        return this._pliteralValue_;
    }

    public void setPliteralValue(PPliteralValue node)
    {
        if(this._pliteralValue_ != null)
        {
            this._pliteralValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pliteralValue_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pliteralValue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pliteralValue_ == child)
        {
            this._pliteralValue_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pliteralValue_ == oldChild)
        {
            setPliteralValue((PPliteralValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
