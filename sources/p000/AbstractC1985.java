package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.search.EnvironmentInitializer;

/* JADX INFO: renamed from: ۥٟؑۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1985 extends AbstractC3003 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f6552;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f6553;

    public AbstractC1985() {
        new C4441(new long[]{7382267532281454246L, -263885719211297643L, 3068298949519857553L}).toString();
        this.f6553 = new C4441(new long[]{7334433794845558447L, -6767176904058885212L}).toString();
        this.f6552 = R.string.hook_core;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public abstract String mo484();

    /* JADX INFO: renamed from: ۦٌ */
    public final void m3886() {
        C4524.f14953.getClass();
        LinkedHashMap linkedHashMap = C4524.f14956;
        if (linkedHashMap.containsKey(mo223())) {
            return;
        }
        String strMo223 = mo223();
        C0971 c0971 = C0971.f3428;
        C1185 c1185 = new C1185(2, AbstractC4009.m7184(mo222(), new Object[0]));
        c0971.getClass();
        linkedHashMap.put(strMo223, c0971.m2034(C1185.Companion.serializer(), c1185));
        ArrayList arrayList = C2503.f8322;
        C2503.m4658(6, AbstractC4009.m7184(R.string.error_log_info6, mo223()), null);
    }

    /* JADX INFO: renamed from: ۦِ */
    public int mo222() {
        return this.f6552;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final String m3887() {
        return EnvironmentInitializer.f405.getClass(mo223());
    }

    /* JADX INFO: renamed from: ۦۗ */
    public String mo223() {
        return this.f6553;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m3888(int i) {
        C4524.f14953.getClass();
        C1443 c1443M7845 = C4524.m7845();
        C1542 c1542 = AbstractC2539.f8457;
        Object obj = c1542.f5218;
        String str = c1542.f5219;
        boolean z = C1443.f4940;
        if (((Boolean) c1443M7845.m3068(obj, str)).booleanValue() || EnvironmentInitializer.f404 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = C4524.f14956;
        if (!linkedHashMap.containsKey(mo223())) {
            String strMo223 = mo223();
            C0971 c0971 = C0971.f3428;
            C1185 c1185 = new C1185(4, AbstractC4009.m7184(mo222(), new Object[0]));
            c0971.getClass();
            linkedHashMap.put(strMo223, c0971.m2034(C1185.Companion.serializer(), c1185));
        }
        ArrayList arrayList = C2503.f8322;
        C2503.m4658(6, AbstractC4009.m7184(i, mo223()), null);
    }
}
