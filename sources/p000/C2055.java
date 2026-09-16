package p000;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: renamed from: ۥۣٟۖؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2055 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2055 f6770 = new C2055();

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4008(View view, InterfaceC3737 interfaceC3737) {
        Context context = view.getContext();
        PointerIcon systemIcon = interfaceC3737 instanceof C4885 ? PointerIcon.getSystemIcon(context, ((C4885) interfaceC3737).f16068) : PointerIcon.getSystemIcon(context, 1000);
        if (AbstractC3831.m6874(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
