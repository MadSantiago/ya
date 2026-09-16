package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦۦؘٟؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5787 extends AbstractC3003 {

    /* JADX INFO: renamed from: ۥؗ */
    public static long f19064;

    /* JADX INFO: renamed from: ۥُ */
    public static boolean f19065;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5787 f19066 = new C5787();

    /* JADX INFO: renamed from: ۦؑ */
    public static String f19067 = new C4441(new long[]{3813788726573764779L, -8118870373949003913L}).toString();

    @Override // p000.AbstractC3003
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo221() {
        String str;
        String string = new C4441(new long[]{572863712368812256L, 5240379819974638508L, 4274711838146875240L, -2211112305907458608L}).toString();
        C1967.f6501.getClass();
        Context contextM3851 = C1967.m3851();
        if (contextM3851 == null) {
            C1078.m2276("Failed to got SystemContext");
            return;
        }
        PackageInfo packageInfoM1081 = AbstractC0487.m1081(contextM3851, string);
        if (packageInfoM1081 == null) {
            ArrayList arrayList = C2503.f8322;
            C2503.m4658(6, AbstractC4009.m7184(R.string.init_versionCode, new Object[0]), null);
        } else {
            if (packageInfoM1081.applicationInfo == null || (str = packageInfoM1081.versionName) == null) {
                return;
            }
            f19067 = str;
            f19064 = Build.VERSION.SDK_INT >= 28 ? packageInfoM1081.getLongVersionCode() : packageInfoM1081.versionCode;
            Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(packageInfoM1081.applicationInfo.sourceDir).entries();
            while (enumerationEntries.hasMoreElements()) {
                if (AbstractC0684.m1527(enumerationEntries.nextElement().getName(), new C4441(new long[]{7666655369210067224L, -6910279973174126668L}).toString(), false)) {
                    f19065 = true;
                    return;
                }
            }
        }
    }
}
