package p000;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۥؒؓٞۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0250 extends AbstractC2164 {

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ int f923;

    /* JADX INFO: renamed from: ۦٛ */
    public final /* synthetic */ C4075 f924;

    public /* synthetic */ C0250(C4075 c4075, int i) {
        this.f923 = i;
        this.f924 = c4075;
    }

    @Override // p000.InterfaceC1953
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo526() {
        View view;
        int i = this.f923;
        C4075 c4075 = this.f924;
        switch (i) {
            case 0:
                if (c4075.f13591 && (view = c4075.f13587) != null) {
                    view.setTranslationY(0.0f);
                    c4075.f13579.setTranslationY(0.0f);
                }
                c4075.f13579.setVisibility(8);
                c4075.f13579.setTransitioning(false);
                c4075.f13569 = null;
                C5002 c5002 = c4075.f13586;
                if (c5002 != null) {
                    c5002.m8398(c4075.f13582);
                    c4075.f13582 = null;
                    c4075.f13586 = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c4075.f13568;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC3608.f12013;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                c4075.f13569 = null;
                c4075.f13579.requestLayout();
                break;
        }
    }
}
