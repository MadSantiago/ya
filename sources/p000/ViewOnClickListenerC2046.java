package p000;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: ۥًٕۖؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC2046 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0251 f6750;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2593 f6751;

    public ViewOnClickListenerC2046(C0251 c0251) {
        this.f6750 = c0251;
        Context context = c0251.f930.getContext();
        CharSequence charSequence = c0251.f929;
        C2593 c2593 = new C2593();
        c2593.f8656 = 4096;
        c2593.f8667 = 4096;
        c2593.f8662 = null;
        c2593.f8663 = null;
        c2593.f8668 = false;
        c2593.f8670 = false;
        c2593.f8669 = 16;
        c2593.f8665 = context;
        c2593.f8660 = charSequence;
        this.f6751 = c2593;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0251 c0251 = this.f6750;
        Window.Callback callback = c0251.f936;
        if (callback == null || !c0251.f932) {
            return;
        }
        callback.onMenuItemSelected(0, this.f6751);
    }
}
