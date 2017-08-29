/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APifStmt extends PPifStmt
{
    private TTif _tif_;
    private PPifStmtOpc _pifStmtOpc_;
    private PPexpression _pexpression_;
    private PPblock _pblock_;
    private PPelse _pelse_;

    public APifStmt()
    {
        // Constructor
    }

    public APifStmt(
        @SuppressWarnings("hiding") TTif _tif_,
        @SuppressWarnings("hiding") PPifStmtOpc _pifStmtOpc_,
        @SuppressWarnings("hiding") PPexpression _pexpression_,
        @SuppressWarnings("hiding") PPblock _pblock_,
        @SuppressWarnings("hiding") PPelse _pelse_)
    {
        // Constructor
        setTif(_tif_);

        setPifStmtOpc(_pifStmtOpc_);

        setPexpression(_pexpression_);

        setPblock(_pblock_);

        setPelse(_pelse_);

    }

    @Override
    public Object clone()
    {
        return new APifStmt(
            cloneNode(this._tif_),
            cloneNode(this._pifStmtOpc_),
            cloneNode(this._pexpression_),
            cloneNode(this._pblock_),
            cloneNode(this._pelse_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPifStmt(this);
    }

    public TTif getTif()
    {
        return this._tif_;
    }

    public void setTif(TTif node)
    {
        if(this._tif_ != null)
        {
            this._tif_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tif_ = node;
    }

    public PPifStmtOpc getPifStmtOpc()
    {
        return this._pifStmtOpc_;
    }

    public void setPifStmtOpc(PPifStmtOpc node)
    {
        if(this._pifStmtOpc_ != null)
        {
            this._pifStmtOpc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pifStmtOpc_ = node;
    }

    public PPexpression getPexpression()
    {
        return this._pexpression_;
    }

    public void setPexpression(PPexpression node)
    {
        if(this._pexpression_ != null)
        {
            this._pexpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pexpression_ = node;
    }

    public PPblock getPblock()
    {
        return this._pblock_;
    }

    public void setPblock(PPblock node)
    {
        if(this._pblock_ != null)
        {
            this._pblock_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pblock_ = node;
    }

    public PPelse getPelse()
    {
        return this._pelse_;
    }

    public void setPelse(PPelse node)
    {
        if(this._pelse_ != null)
        {
            this._pelse_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pelse_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tif_)
            + toString(this._pifStmtOpc_)
            + toString(this._pexpression_)
            + toString(this._pblock_)
            + toString(this._pelse_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tif_ == child)
        {
            this._tif_ = null;
            return;
        }

        if(this._pifStmtOpc_ == child)
        {
            this._pifStmtOpc_ = null;
            return;
        }

        if(this._pexpression_ == child)
        {
            this._pexpression_ = null;
            return;
        }

        if(this._pblock_ == child)
        {
            this._pblock_ = null;
            return;
        }

        if(this._pelse_ == child)
        {
            this._pelse_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tif_ == oldChild)
        {
            setTif((TTif) newChild);
            return;
        }

        if(this._pifStmtOpc_ == oldChild)
        {
            setPifStmtOpc((PPifStmtOpc) newChild);
            return;
        }

        if(this._pexpression_ == oldChild)
        {
            setPexpression((PPexpression) newChild);
            return;
        }

        if(this._pblock_ == oldChild)
        {
            setPblock((PPblock) newChild);
            return;
        }

        if(this._pelse_ == oldChild)
        {
            setPelse((PPelse) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}