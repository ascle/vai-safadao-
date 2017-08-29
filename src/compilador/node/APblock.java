/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APblock extends PPblock
{
    private TTabreChave _tabreChave_;
    private PPstatementList _pstatementList_;
    private TTfechaChave _tfechaChave_;

    public APblock()
    {
        // Constructor
    }

    public APblock(
        @SuppressWarnings("hiding") TTabreChave _tabreChave_,
        @SuppressWarnings("hiding") PPstatementList _pstatementList_,
        @SuppressWarnings("hiding") TTfechaChave _tfechaChave_)
    {
        // Constructor
        setTabreChave(_tabreChave_);

        setPstatementList(_pstatementList_);

        setTfechaChave(_tfechaChave_);

    }

    @Override
    public Object clone()
    {
        return new APblock(
            cloneNode(this._tabreChave_),
            cloneNode(this._pstatementList_),
            cloneNode(this._tfechaChave_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPblock(this);
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

    public PPstatementList getPstatementList()
    {
        return this._pstatementList_;
    }

    public void setPstatementList(PPstatementList node)
    {
        if(this._pstatementList_ != null)
        {
            this._pstatementList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pstatementList_ = node;
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
            + toString(this._pstatementList_)
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

        if(this._pstatementList_ == child)
        {
            this._pstatementList_ = null;
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

        if(this._pstatementList_ == oldChild)
        {
            setPstatementList((PPstatementList) newChild);
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
