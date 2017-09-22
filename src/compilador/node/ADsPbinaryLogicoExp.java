/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ADsPbinaryLogicoExp extends PPbinaryLogicoExp
{
    private PPbinaryLogicoFactor _pbinaryLogicoFactor_;

    public ADsPbinaryLogicoExp()
    {
        // Constructor
    }

    public ADsPbinaryLogicoExp(
        @SuppressWarnings("hiding") PPbinaryLogicoFactor _pbinaryLogicoFactor_)
    {
        // Constructor
        setPbinaryLogicoFactor(_pbinaryLogicoFactor_);

    }

    @Override
    public Object clone()
    {
        return new ADsPbinaryLogicoExp(
            cloneNode(this._pbinaryLogicoFactor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADsPbinaryLogicoExp(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._pbinaryLogicoFactor_);
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

        throw new RuntimeException("Not a child.");
    }
}