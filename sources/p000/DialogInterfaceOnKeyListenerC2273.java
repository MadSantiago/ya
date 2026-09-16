package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: ۥۚؔؒۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC2273 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC3370 {

    /* JADX INFO: renamed from: ۥْ */
    public C5007 f7547;

    /* JADX INFO: renamed from: ۦ۟ */
    public DialogInterfaceC4964 f7548;

    /* JADX INFO: renamed from: ۦۨ */
    public MenuC4903 f7549;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MenuC4903 menuC4903 = this.f7549;
        C5007 c5007 = this.f7547;
        C2085 c2085 = c5007.f16577;
        if (c2085 == null) {
            c2085 = new C2085(c5007);
            c5007.f16577 = c2085;
        }
        menuC4903.m8299(c2085.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f7547.mo4535(this.f7549, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        MenuC4903 menuC4903 = this.f7549;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f7548.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f7548.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                menuC4903.m8297(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return menuC4903.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.InterfaceC3370
    /* JADX INFO: renamed from: ۥْ */
    public final boolean mo2761(MenuC4903 menuC4903) {
        return false;
    }

    @Override // p000.InterfaceC3370
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2765(MenuC4903 menuC4903, boolean z) {
        DialogInterfaceC4964 dialogInterfaceC4964;
        if ((z || menuC4903 == this.f7549) && (dialogInterfaceC4964 = this.f7548) != null) {
            dialogInterfaceC4964.dismiss();
        }
    }
}
