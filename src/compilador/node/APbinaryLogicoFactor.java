/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APbinaryLogicoFactor extends PPbinaryLogicoFactor
{
    private PPbinaryLogicoFactor _pbinaryLogicoFactor_;
    private TTandLogico _tandLogico_;
    private PPbinaryLogicoTermo _pbinaryLogicoTermo_;

    public APbinaryLogicoFactor()
    {
        // Constructor
    }

    public APbinaryLogicoFactor(
        @SuppressWarnings("hiding") PPbinaryLogicoFactor _pbinaryLogicoFactor_,
        @SuppressWarnings("hiding") TTandLogico _tandLogico_,
        @SuppressWarnings("hiding") PPbinaryLogicoTermo _pbinaryLogicoTermo_)
    {
        // Constructor
        setPbinaryLogicoFactor(_pbinaryLogicoFactor_);

        setTandLogico(_tandLogico_);

        setPbinaryLogicoTermo(_pbinaryLogicoTermo_);

    }

    @Override
    public Object clone()
    {
        return new APbinaryLogicoFactor(
            cloneNode(this._pbinaryLogicoFactor_),
            cloneNode(this._tandLogico_),
            cloneNode(this._pbinaryLogicoTermo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPbinaryLogicoFactor(this);
    }

    public PPbinaryLogicoFactor getPbinaryLogicoFactor()
    {
        return this._pbinaryLogicoFactor_;
    }

    public void setPbinaryLogicoFactor(PPbinaryLogicoFactor node)
    {
        if(this._pbinaryLogicoFactor_ != null)
        {
            this._pbinaryLogicoFactor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pbinaryLogicoFactor_ = node;
    }

    public TTandLogico getTandLogico()
    {
        return this._tandLogico_;
    }

    public void setTandLogico(TTandLogico node)
    {
        if(this._tandLogico_ != null)
        {
            this._tandLogico_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tandLogico_ = node;
    }

    public PPbinaryLogicoTermo getPbinaryLogicoTermo()
    {
        return this._pbinaryLogicoTermo_;
    }

    public void setPbinaryLogicoTermo(PPbinaryLogicoTermo node)
    {
        if(this._pbinaryLogicoTermo_ != null)
        {
            this._pbinaryLogicoTermo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pbinaryLogicoTermo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pbinaryLogicoFactor_)
            + toString(this._tandLogico_)
            + toString(this._pbinaryLogicoTermo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pbinaryLogicoFactor_ == child)
        {
            this._pbinaryLogicoFactor_ = null;
            return;
        }

        if(this._tandLogico_ == child)
        {
            this._tandLogico_ = null;
            return;
        }

        if(this._pbinaryLogicoTermo_ == child)
        {
            this._pbinaryLogicoTermo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pbinaryLogicoFactor_ == oldChild)
        {
            setPbinaryLogicoFactor((PPbinaryLogicoFactor) newChild);
            return;
        }

        if(this._tandLogico_ == oldChild)
        {
            setTandLogico((TTandLogico) newChild);
            return;
        }

        if(this._pbinaryLogicoTermo_ == oldChild)
        {
            setPbinaryLogicoTermo((PPbinaryLogicoTermo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}