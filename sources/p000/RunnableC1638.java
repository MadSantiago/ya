package p000;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: ۥُٜٙؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1638 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ ActionBarOverlayLayout f5478;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5479;

    public /* synthetic */ RunnableC1638(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f5479 = i;
        this.f5478 = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5479;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f5478;
        switch (i) {
            case 0:
                actionBarOverlayLayout.m27();
                actionBarOverlayLayout.f82 = actionBarOverlayLayout.f70.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f84);
                break;
            default:
                actionBarOverlayLayout.m27();
                actionBarOverlayLayout.f82 = actionBarOverlayLayout.f70.animate().translationY(-actionBarOverlayLayout.f70.getHeight()).setListener(actionBarOverlayLayout.f84);
                break;
        }
    }
}
