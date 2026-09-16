package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: ۥٌٝؖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1906 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ View f6290;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C0460 f6291;

    public C1906(C0460 c0460, View view) {
        this.f6291 = c0460;
        this.f6290 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0460 c0460 = this.f6291;
        c0460.f1659.mo8770(1.0f);
        C2275.m4322(c0460, this.f6290);
    }
}
