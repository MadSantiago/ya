package p000;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.DexKitBridge;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦٚؑؑ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4524 extends AbstractC1985 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C4524 f14953;

    /* JADX INFO: renamed from: ۥّ */
    public static final C4524 f14954;

    /* JADX INFO: renamed from: ۥۜ */
    public static final C2432 f14955;

    /* JADX INFO: renamed from: ۦۙ */
    public static final LinkedHashMap f14956;

    /* JADX INFO: renamed from: ۦؑ */
    public DexKitBridge f14957;

    static {
        C4524 c4524 = new C4524();
        f14953 = c4524;
        f14954 = c4524;
        f14956 = new LinkedHashMap();
        f14955 = new C2432(new C0062(13));
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static C1443 m7845() {
        return (C1443) f14955.getValue();
    }

    /* JADX INFO: renamed from: ۥْ */
    public final void m7846() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        Set setM513 = AbstractC0246.m513(new Set[]{AbstractC4967.f16439, AbstractC4967.f16434, AbstractC4967.f16440, AbstractC4967.f16435, AbstractC4967.f16436, AbstractC4967.f16442});
        ArrayList arrayList = new ArrayList();
        Iterator it = setM513.iterator();
        while (it.hasNext()) {
            AbstractC3649.m6529((Iterable) it.next(), arrayList);
        }
        linkedHashSet.addAll(arrayList);
        List listM4188 = AbstractC2164.m4188(AbstractC2539.f8453, AbstractC2539.f8438, AbstractC2539.f8437);
        Iterator it2 = AbstractC2164.m4188(AbstractC4967.f16438, AbstractC4967.f16441, AbstractC4967.f16437).iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            C4524 c4524 = f14953;
            if (!zHasNext) {
                if (C5787.f19065) {
                    linkedHashSet.add(C5677.f18661);
                }
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    c4524.m7249((AbstractC3003) it3.next());
                }
                DexKitBridge dexKitBridge = this.f14957;
                if (dexKitBridge != null) {
                    dexKitBridge.close();
                    return;
                }
                return;
            }
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2164.m4180();
                throw null;
            }
            Set set = (Set) next;
            c4524.getClass();
            C1443 c1443M7845 = m7845();
            C1542 c1542 = (C1542) listM4188.get(i);
            Object obj = c1542.f5218;
            String str = c1542.f5219;
            boolean z = C1443.f4940;
            if (((Boolean) c1443M7845.m3068(obj, str)).booleanValue()) {
                linkedHashSet.addAll(set);
            }
            i = i2;
        }
    }

    @Override // p000.AbstractC3003
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo221() {
        if (C5787.f19064 < 739523110) {
            ArrayList arrayList = C2503.f8322;
            C2503.m4658(6, AbstractC4009.m7184(R.string.low_version, Long.valueOf(C5787.f19064), 739523110), null);
            return;
        }
        C0086 c0086 = new C0086(4);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Class<Application> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(Application.class));
        C4229 c4229 = new C4229(clsM9037 != null ? clsM9037 : Application.class, null, 1);
        C2244 c2244 = new C2244();
        c2244.f9028 = c4229;
        c2244.f9027 = new C4441(new long[]{-251084864507335850L, -5583939554172838931L}).toString();
        m7252((C3657) AbstractC0973.m2045(c2244.m4293()), 1).m6591(new C0079(1, atomicBoolean, c0086));
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final DexKitBridge m7847() {
        ApplicationInfo applicationInfoM3849;
        DexKitBridge dexKitBridge = this.f14957;
        if (dexKitBridge != null) {
            return dexKitBridge;
        }
        ArrayList arrayList = C2503.f8322;
        C2503.m4654(AbstractC4009.m7184(R.string.obfuscation_search3, new C4441(new long[]{-2234408268919642934L, -3681152705890333975L}).toString(), 394));
        C2503.m4654(AbstractC4009.m7184(R.string.obfuscation_search4, C5787.f19067, Long.valueOf(C5787.f19064)));
        C2319 c2319 = this.f13492;
        if (c2319 == null || (applicationInfoM3849 = c2319.f7669) == null) {
            C1967.f6501.getClass();
            applicationInfoM3849 = C1967.m3849();
            if (applicationInfoM3849 == null) {
                applicationInfoM3849 = new ApplicationInfo();
            }
        }
        DexKitBridge dexKitBridge2 = new DexKitBridge(applicationInfoM3849.sourceDir);
        this.f14957 = dexKitBridge2;
        return dexKitBridge2;
    }
}
