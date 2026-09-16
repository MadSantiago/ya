package p000;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۥًٌؕۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0904 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C2165 f3248;

    public C0904(C2165 c2165) {
        this.f3248 = c2165;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f3248.m4219(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f3248.m4218(drawable);
    }
}
