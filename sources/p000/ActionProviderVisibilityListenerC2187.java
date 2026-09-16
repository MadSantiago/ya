package p000;

import android.view.ActionProvider;

/* JADX INFO: renamed from: ۥؘٟۘؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC2187 implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: ۥۗ */
    public final ActionProvider f7252;

    /* JADX INFO: renamed from: ۥۣ */
    public C1039 f7253;

    public ActionProviderVisibilityListenerC2187(MenuItemC0784 menuItemC0784, ActionProvider actionProvider) {
        this.f7252 = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C1039 c1039 = this.f7253;
        if (c1039 != null) {
            MenuC4903 menuC4903 = ((C1092) c1039.f3672).f3834;
            menuC4903.f16181 = true;
            menuC4903.m8311(true);
        }
    }
}
