package p000;

import android.R;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ۦٖٔؕ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4187 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final ViewGroup.LayoutParams f13930 = new ViewGroup.LayoutParams(-2, -2);

    /* JADX INFO: renamed from: ۥۣ */
    public static void m7373(AbstractActivityC1500 abstractActivityC1500, C0857 c0857) {
        View childAt = ((ViewGroup) abstractActivityC1500.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C2626 c2626 = childAt instanceof C2626 ? (C2626) childAt : null;
        if (c2626 != null) {
            c2626.setParentCompositionContext(null);
            c2626.setContent(c0857);
            return;
        }
        C2626 c2627 = new C2626(abstractActivityC1500);
        c2627.setParentCompositionContext(null);
        c2627.setContent(c0857);
        View decorView = abstractActivityC1500.getWindow().getDecorView();
        if (AbstractC5568.m9365(decorView) == null) {
            decorView.setTag(ru.bluecat.yandexmapspatcher.R.id.view_tree_lifecycle_owner, abstractActivityC1500);
        }
        if (AbstractC3801.m6743(decorView) == null) {
            decorView.setTag(ru.bluecat.yandexmapspatcher.R.id.view_tree_view_model_store_owner, abstractActivityC1500);
        }
        if (AbstractC4593.m7995(decorView) == null) {
            decorView.setTag(ru.bluecat.yandexmapspatcher.R.id.view_tree_saved_state_registry_owner, abstractActivityC1500);
        }
        abstractActivityC1500.setContentView(c2627, f13930);
    }
}
