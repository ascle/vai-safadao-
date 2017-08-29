/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APliteralValue extends PPliteralValue
{
    private TTabreChave _tabreChave_;
    private PPliteralValueOpc _pliteralValueOpc_;
    private TTfechaChave _tfechaChave_;

    public APliteralValue()
    {
        // Constructor
    }

    public APliteralValue(
        @SuppressWarnings("hiding") TTabreChave _tabreChave_,
        @SuppressWarnings("hiding") PPliteralValueOpc _pliteralValueOpc_,
        @SuppressWarnings("hiding") TTfechaChave _tfechaChave_)
    {
        // Constructor
        setTabreChave(_tabreChave_);

        setPliteralValueOpc(_pliteralValueOpc_);

        setTfechaChave(_tfechaChave_);

    }

    @Override
    public Object clone()
    {
        return new APliteralValue(
            cloneNode(this._tabreChave_),
            cloneNode(this._pliteralValueOpc_),
            cloneNode(this._tfechaChave_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPliteralValue(this);
    }

    public TTabreChave getTabreChave()
    {
        return this._tabreChave_;
    }

    public void setTabreChave(TTabreChave node)
    {
        if(this._tabreChave_ != null)
        {
            this._tabreChave_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tabreChave_ = node;
    }

    public PPliteralValueOpc getPliteralValueOpc()
    {
        return this._pliteralValueOpc_;
    }

    public void setPliteralValueOpc(PPliteralValueOpc node)
    {
        if(this._pliteralValueOpc_ != null)
        {
            this._pliteralValueOpc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pliteralValueOpc_ = node;
    }

    public TTfechaChave getTfechaChave()
    {
        return this._tfechaChave_;
    }

    public void setTfechaChave(TTfechaChave node)
    {
        if(this._tfechaChave_ != null)
        {
            this._tfechaChave_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tfechaChave_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tabreChave_)
            + toString(this._pliteralValueOpc_)
            + toString(this._tfechaChave_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tabreChave_ == child)
        {
            this._tabreChave_ = null;
            return;
        }

        if(this._pliteralValueOpc_ == child)
        {
            this._pliteralValueOpc_ = null;
            return;
        }

        if(this._tfechaChave_ == child)
        {
            this._tfechaChave_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tabreChave_ == oldChild)
        {
            setTabreChave((TTabreChave) newChild);
            return;
        }

        if(this._pliteralValueOpc_ == oldChild)
        {
            setPliteralValueOpc((PPliteralValueOpc) newChild);
            return;
        }

        if(this._tfechaChave_ == oldChild)
        {
            setTfechaChave((TTfechaChave) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}