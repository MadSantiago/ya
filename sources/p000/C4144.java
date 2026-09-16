package p000;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۦٓؗۡٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4144 extends C0990 implements InterfaceC3864 {

    /* JADX INFO: renamed from: ۥۤ */
    public static final Method f13803;

    /* JADX INFO: renamed from: ۥٛ */
    public C4228 f13804;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f13803 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p000.InterfaceC3864
    /* JADX INFO: renamed from: ۥّ */
    public final void mo6897(MenuC4903 menuC4903, MenuItem menuItem) {
        C4228 c4228 = this.f13804;
        if (c4228 != null) {
            c4228.mo6897(menuC4903, menuItem);
        }
    }

    @Override // p000.C0990
    /* JADX INFO: renamed from: ۥۣ */
    public final C1391 mo2106(Context context, boolean z) {
        C4820 c4820 = new C4820(context, z);
        c4820.setHoverListener(this);
        return c4820;
    }

    @Override // p000.InterfaceC3864
    /* JADX INFO: renamed from: ۦِ */
    public final void mo6898(MenuC4903 menuC4903, C1092 c1092) {
        C4228 c4228 = this.f13804;
        if (c4228 != null) {
            c4228.mo6898(menuC4903, c1092);
        }
    }
}
