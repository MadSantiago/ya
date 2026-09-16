package ru.bluecat.yandexmapspatcher.search;

import android.app.Application;
import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import p000.AbstractC0684;
import p000.C2503;
import p000.C4441;
import p000.C5028;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnvironmentInitializer {

    /* JADX INFO: renamed from: ۥؗ */
    public static MMKV f403;

    /* JADX INFO: renamed from: ۥۗ */
    public static MMKV f404;

    /* JADX INFO: renamed from: ۥۣ */
    public static final EnvironmentInitializer f405 = new EnvironmentInitializer();

    private final native String getKey();

    /* JADX INFO: renamed from: ۥۗ */
    public static MMKV m165() {
        MMKV mmkv = f403;
        if (mmkv != null) {
            return mmkv;
        }
        new C4441(new long[]{3290950328651045401L, -1938341899138175706L, 195513846591365270L}).toString();
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static MMKV m166() {
        MMKV mmkv = f404;
        if (mmkv != null) {
            return mmkv;
        }
        new C4441(new long[]{6530193942946261552L, -7837792553876085319L, 6153775660251140445L}).toString();
        return null;
    }

    public final native String getClass(String str);

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m167(Application application) {
        try {
            MMKV.m146(application, application.getFilesDir() + "/ym_mmkv", new C5028(3));
            f403 = MMKV.m149(new C4441(new long[]{-7627923099888428244L, 2848744318688450010L}).toString());
            f404 = MMKV.m148(new C4441(new long[]{2834813058301306L, -7966767253917667373L}).toString(), getKey());
            return true;
        } catch (UnsatisfiedLinkError e) {
            if (!AbstractC0684.m1527(e.toString(), new C4441(new long[]{-769619225822314554L, -1379573237774516207L, -4528855784082476381L}).toString(), false)) {
                ArrayList arrayList = C2503.f8322;
                C2503.m4656(new C4441(new long[]{-6720074037293479171L, 3563429483621707433L, 6080747066684573720L, 3311894386177703089L}).toString(), e);
            }
            return false;
        }
    }
}
