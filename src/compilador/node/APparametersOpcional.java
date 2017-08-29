/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APparametersOpcional extends PPparametersOpcional
{
    private PPparameterList _pparameterList_;
    private TTvirgula _tvirgula_;

    public APparametersOpcional()
    {
        // Constructor
    }

    public APparametersOpcional(
        @SuppressWarnings("hiding") PPparameterList _pparameterList_,
        @SuppressWarnings("hiding") TTvirgula _tvirgula_)
    {
        // Constructor
        setPparameterList(_pparameterList_);

        setTvirgula(_tvirgula_);

    }

    @Override
    public Object clone()
    {
        return new APparametersOpcional(
            cloneNode(this._pparameterList_),
            cloneNode(this._tvirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPparametersOpcional(this);
    }

    public PPparameterList getPparameterList()
    {
        return this._pparameterList_;
    }

    public void setPparameterList(PPparameterList node)
    {
        if(this._pparameterList_ != null)
        {
            this._pparameterList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pparameterList_ = node;
    }

    public TTvirgula getTvirgula()
    {
        return this._tvirgula_;
    }

    public void setTvirgula(TTvirgula node)
    {
        if(this._tvirgula_ != null)
        {
            this._tvirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tvirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pparameterList_)
            + toString(this._tvirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pparameterList_ == child)
        {
            this._pparameterList_ = null;
            return;
        }

        if(this._tvirgula_ == child)
        {
            this._tvirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pparameterList_ == oldChild)
        {
            setPparameterList((PPparameterList) newChild);
            return;
        }

        if(this._tvirgula_ == oldChild)
        {
            setTvirgula((TTvirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
