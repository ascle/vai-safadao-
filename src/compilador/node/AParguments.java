/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AParguments extends PParguments
{
    private TTabreParen _tabreParen_;
    private PPargumentsCorpo _pargumentsCorpo_;
    private TTfechaParen _tfechaParen_;

    public AParguments()
    {
        // Constructor
    }

    public AParguments(
        @SuppressWarnings("hiding") TTabreParen _tabreParen_,
        @SuppressWarnings("hiding") PPargumentsCorpo _pargumentsCorpo_,
        @SuppressWarnings("hiding") TTfechaParen _tfechaParen_)
    {
        // Constructor
        setTabreParen(_tabreParen_);

        setPargumentsCorpo(_pargumentsCorpo_);

        setTfechaParen(_tfechaParen_);

    }

    @Override
    public Object clone()
    {
        return new AParguments(
            cloneNode(this._tabreParen_),
            cloneNode(this._pargumentsCorpo_),
            cloneNode(this._tfechaParen_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParguments(this);
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

    public PPargumentsCorpo getPargumentsCorpo()
    {
        return this._pargumentsCorpo_;
    }

    public void setPargumentsCorpo(PPargumentsCorpo node)
    {
        if(this._pargumentsCorpo_ != null)
        {
            this._pargumentsCorpo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pargumentsCorpo_ = node;
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
            + toString(this._pargumentsCorpo_)
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

        if(this._pargumentsCorpo_ == child)
        {
            this._pargumentsCorpo_ = null;
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

        if(this._pargumentsCorpo_ == oldChild)
        {
            setPargumentsCorpo((PPargumentsCorpo) newChild);
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
