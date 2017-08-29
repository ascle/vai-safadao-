/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APtype extends PPtype
{
    private TTabreParen _tabreParen_;
    private PPtype _ptype_;
    private TTfechaParen _tfechaParen_;

    public APtype()
    {
        // Constructor
    }

    public APtype(
        @SuppressWarnings("hiding") TTabreParen _tabreParen_,
        @SuppressWarnings("hiding") PPtype _ptype_,
        @SuppressWarnings("hiding") TTfechaParen _tfechaParen_)
    {
        // Constructor
        setTabreParen(_tabreParen_);

        setPtype(_ptype_);

        setTfechaParen(_tfechaParen_);

    }

    @Override
    public Object clone()
    {
        return new APtype(
            cloneNode(this._tabreParen_),
            cloneNode(this._ptype_),
            cloneNode(this._tfechaParen_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPtype(this);
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
            + toString(this._ptype_)
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

        if(this._ptype_ == child)
        {
            this._ptype_ = null;
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

        if(this._ptype_ == oldChild)
        {
            setPtype((PPtype) newChild);
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
