/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APvarDeclAgrupLoopPvarDeclAgrupParen extends PPvarDeclAgrupParen
{
    private TTfechaParen _tfechaParen_;

    public APvarDeclAgrupLoopPvarDeclAgrupParen()
    {
        // Constructor
    }

    public APvarDeclAgrupLoopPvarDeclAgrupParen(
        @SuppressWarnings("hiding") TTfechaParen _tfechaParen_)
    {
        // Constructor
        setTfechaParen(_tfechaParen_);

    }

    @Override
    public Object clone()
    {
        return new APvarDeclAgrupLoopPvarDeclAgrupParen(
            cloneNode(this._tfechaParen_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPvarDeclAgrupLoopPvarDeclAgrupParen(this);
    }

    public TTfechaParen getTfechaParen()
    {
        return this._tfechaParen_;
    }

    public void setTfechaParen(TTfechaParen node)
    {
        if(this._tfechaParen_ != null)
        {
            this._tfechaParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tfechaParen_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tfechaParen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tfechaParen_ == child)
        {
            this._tfechaParen_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tfechaParen_ == oldChild)
        {
            setTfechaParen((TTfechaParen) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
