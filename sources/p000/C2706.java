package p000;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: ۥّۤٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2706 implements KeyListener {

    /* JADX INFO: renamed from: ۥۣ */
    public final KeyListener f8965;

    public C2706(KeyListener keyListener) {
        this.f8965 = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f8965.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f8965.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean zM4155;
        if (i != 67) {
            zM4155 = i != 112 ? false : AbstractC2133.m4155(editable, keyEvent, true);
        } else {
            zM4155 = AbstractC2133.m4155(editable, keyEvent, false);
        }
        if (!zM4155) {
            return this.f8965.onKeyDown(view, editable, i, keyEvent);
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f8965.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f8965.onKeyUp(view, editable, i, keyEvent);
    }
}
