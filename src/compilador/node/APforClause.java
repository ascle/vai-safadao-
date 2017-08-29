/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APforClause extends PPforClause
{
    private PPinitStmt _pinitStmt_;
    private TTpontoEVirgula _tpontoEVirgula_;
    private PPcondition _pcondition_;
    private PPforClauseFator _pforClauseFator_;

    public APforClause()
    {
        // Constructor
    }

    public APforClause(
        @SuppressWarnings("hiding") PPinitStmt _pinitStmt_,
        @SuppressWarnings("hiding") TTpontoEVirgula _tpontoEVirgula_,
        @SuppressWarnings("hiding") PPcondition _pcondition_,
        @SuppressWarnings("hiding") PPforClauseFator _pforClauseFator_)
    {
        // Constructor
        setPinitStmt(_pinitStmt_);

        setTpontoEVirgula(_tpontoEVirgula_);

        setPcondition(_pcondition_);

        setPforClauseFator(_pforClauseFator_);

    }

    @Override
    public Object clone()
    {
        return new APforClause(
            cloneNode(this._pinitStmt_),
            cloneNode(this._tpontoEVirgula_),
            cloneNode(this._pcondition_),
            cloneNode(this._pforClauseFator_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPforClause(this);
    }

    public PPinitStmt getPinitStmt()
    {
        return this._pinitStmt_;
    }

    public void setPinitStmt(PPinitStmt node)
    {
        if(this._pinitStmt_ != null)
        {
            this._pinitStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pinitStmt_ = node;
    }

    public TTpontoEVirgula getTpontoEVirgula()
    {
        return this._tpontoEVirgula_;
    }

    public void setTpontoEVirgula(TTpontoEVirgula node)
    {
        if(this._tpontoEVirgula_ != null)
        {
            this._tpontoEVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tpontoEVirgula_ = node;
    }

    public PPcondition getPcondition()
    {
        return this._pcondition_;
    }

    public void setPcondition(PPcondition node)
    {
        if(this._pcondition_ != null)
        {
            this._pcondition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pcondition_ = node;
    }

    public PPforClauseFator getPforClauseFator()
    {
        return this._pforClauseFator_;
    }

    public void setPforClauseFator(PPforClauseFator node)
    {
        if(this._pforClauseFator_ != null)
        {
            this._pforClauseFator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pforClauseFator_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pinitStmt_)
            + toString(this._tpontoEVirgula_)
            + toString(this._pcondition_)
            + toString(this._pforClauseFator_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pinitStmt_ == child)
        {
            this._pinitStmt_ = null;
            return;
        }

        if(this._tpontoEVirgula_ == child)
        {
            this._tpontoEVirgula_ = null;
            return;
        }

        if(this._pcondition_ == child)
        {
            this._pcondition_ = null;
            return;
        }

        if(this._pforClauseFator_ == child)
        {
            this._pforClauseFator_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pinitStmt_ == oldChild)
        {
            setPinitStmt((PPinitStmt) newChild);
            return;
        }

        if(this._tpontoEVirgula_ == oldChild)
        {
            setTpontoEVirgula((TTpontoEVirgula) newChild);
            return;
        }

        if(this._pcondition_ == oldChild)
        {
            setPcondition((PPcondition) newChild);
            return;
        }

        if(this._pforClauseFator_ == oldChild)
        {
            setPforClauseFator((PPforClauseFator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}