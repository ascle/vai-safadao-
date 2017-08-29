/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APbinaryAritTermo extends PPbinaryAritTermo
{
    private TTabreParen _tabreParen_;
    private PPbinaryAritExp _pbinaryAritExp_;
    private TTfechaParen _tfechaParen_;

    public APbinaryAritTermo()
    {
        // Constructor
    }

    public APbinaryAritTermo(
        @SuppressWarnings("hiding") TTabreParen _tabreParen_,
        @SuppressWarnings("hiding") PPbinaryAritExp _pbinaryAritExp_,
        @SuppressWarnings("hiding") TTfechaParen _tfechaParen_)
    {
        // Constructor
        setTabreParen(_tabreParen_);

        setPbinaryAritExp(_pbinaryAritExp_);

        setTfechaParen(_tfechaParen_);

    }

    @Override
    public Object clone()
    {
        return new APbinaryAritTermo(
            cloneNode(this._tabreParen_),
            cloneNode(this._pbinaryAritExp_),
            cloneNode(this._tfechaParen_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPbinaryAritTermo(this);
    }

    public TTabreParen getTabreParen()
    {
        return this._tabreParen_;
    }

    public void setTabreParen(TTabreParen node)
    {
        if(this._tabreParen_ != null)
        {
            this._tabreParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tabreParen_ = node;
    }

    public PPbinaryAritExp getPbinaryAritExp()
    {
        return this._pbinaryAritExp_;
    }

    public void setPbinaryAritExp(PPbinaryAritExp node)
    {
        if(this._pbinaryAritExp_ != null)
        {
            this._pbinaryAritExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pbinaryAritExp_ = node;
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
            + toString(this._tabreParen_)
            + toString(this._pbinaryAritExp_)
            + toString(this._tfechaParen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tabreParen_ == child)
        {
            this._tabreParen_ = null;
            return;
        }

        if(this._pbinaryAritExp_ == child)
        {
            this._pbinaryAritExp_ = null;
            return;
        }

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
        if(this._tabreParen_ == oldChild)
        {
            setTabreParen((TTabreParen) newChild);
            return;
        }

        if(this._pbinaryAritExp_ == oldChild)
        {
            setPbinaryAritExp((PPbinaryAritExp) newChild);
            return;
        }

        if(this._tfechaParen_ == oldChild)
        {
            setTfechaParen((TTfechaParen) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}