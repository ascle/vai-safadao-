/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AParrayType extends PParrayType
{
    private TTabreColchete _tabreColchete_;
    private PParrayLength _parrayLength_;
    private TTfechaColchete _tfechaColchete_;
    private PPelementType _pelementType_;

    public AParrayType()
    {
        // Constructor
    }

    public AParrayType(
        @SuppressWarnings("hiding") TTabreColchete _tabreColchete_,
        @SuppressWarnings("hiding") PParrayLength _parrayLength_,
        @SuppressWarnings("hiding") TTfechaColchete _tfechaColchete_,
        @SuppressWarnings("hiding") PPelementType _pelementType_)
    {
        // Constructor
        setTabreColchete(_tabreColchete_);

        setParrayLength(_parrayLength_);

        setTfechaColchete(_tfechaColchete_);

        setPelementType(_pelementType_);

    }

    @Override
    public Object clone()
    {
        return new AParrayType(
            cloneNode(this._tabreColchete_),
            cloneNode(this._parrayLength_),
            cloneNode(this._tfechaColchete_),
            cloneNode(this._pelementType_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParrayType(this);
    }

    public TTabreColchete getTabreColchete()
    {
        return this._tabreColchete_;
    }

    public void setTabreColchete(TTabreColchete node)
    {
        if(this._tabreColchete_ != null)
        {
            this._tabreColchete_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tabreColchete_ = node;
    }

    public PParrayLength getParrayLength()
    {
        return this._parrayLength_;
    }

    public void setParrayLength(PParrayLength node)
    {
        if(this._parrayLength_ != null)
        {
            this._parrayLength_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parrayLength_ = node;
    }

    public TTfechaColchete getTfechaColchete()
    {
        return this._tfechaColchete_;
    }

    public void setTfechaColchete(TTfechaColchete node)
    {
        if(this._tfechaColchete_ != null)
        {
            this._tfechaColchete_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tfechaColchete_ = node;
    }

    public PPelementType getPelementType()
    {
        return this._pelementType_;
    }

    public void setPelementType(PPelementType node)
    {
        if(this._pelementType_ != null)
        {
            this._pelementType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pelementType_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tabreColchete_)
            + toString(this._parrayLength_)
            + toString(this._tfechaColchete_)
            + toString(this._pelementType_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tabreColchete_ == child)
        {
            this._tabreColchete_ = null;
            return;
        }

        if(this._parrayLength_ == child)
        {
            this._parrayLength_ = null;
            return;
        }

        if(this._tfechaColchete_ == child)
        {
            this._tfechaColchete_ = null;
            return;
        }

        if(this._pelementType_ == child)
        {
            this._pelementType_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tabreColchete_ == oldChild)
        {
            setTabreColchete((TTabreColchete) newChild);
            return;
        }

        if(this._parrayLength_ == oldChild)
        {
            setParrayLength((PParrayLength) newChild);
            return;
        }

        if(this._tfechaColchete_ == oldChild)
        {
            setTfechaColchete((TTfechaColchete) newChild);
            return;
        }

        if(this._pelementType_ == oldChild)
        {
            setPelementType((PPelementType) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
