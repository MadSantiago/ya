package p000;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XModuleResources;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: ۥُۧؗؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2885 extends Resources {

    /* JADX INFO: renamed from: ۥۗ */
    public static final /* synthetic */ int f9623 = 0;

    /* JADX INFO: renamed from: ۥۣ */
    public final XModuleResources f9624;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2885(XModuleResources xModuleResources) {
        Object c4535;
        Object c4536;
        Object c4537;
        try {
            c4535 = xModuleResources.getAssets();
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        AssetManager assetManager = (AssetManager) (c4535 instanceof C4535 ? null : c4535);
        try {
            c4536 = xModuleResources.getDisplayMetrics();
        } catch (Throwable th2) {
            c4536 = new C4535(th2);
        }
        DisplayMetrics displayMetrics = (DisplayMetrics) (c4536 instanceof C4535 ? null : c4536);
        try {
            c4537 = xModuleResources.getConfiguration();
        } catch (Throwable th3) {
            c4537 = new C4535(th3);
        }
        super(assetManager, displayMetrics, (Configuration) (c4537 instanceof C4535 ? null : c4537));
        this.f9624 = xModuleResources;
    }

    public final String toString() {
        return "YukiModuleResources by " + this.f9624;
    }
}
