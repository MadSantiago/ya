package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۥۣۚؑۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2255 {

    /* JADX INFO: renamed from: ۥؗ */
    public Object f7471;

    /* JADX INFO: renamed from: ۥُ */
    public final C5086 f7472;

    /* JADX INFO: renamed from: ۥّ */
    public final LinkedHashMap f7473;

    /* JADX INFO: renamed from: ۥۗ */
    public C3294 f7474;

    /* JADX INFO: renamed from: ۥۜ */
    public AbstractC1434 f7475;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f7476;

    /* JADX INFO: renamed from: ۦؑ */
    public C3369 f7477;

    /* JADX INFO: renamed from: ۦِ */
    public int f7478;

    /* JADX INFO: renamed from: ۦٛ */
    public C5895 f7479;

    /* JADX INFO: renamed from: ۦۙ */
    public final C3066 f7480;

    public C2255(C0834 c0834, Context context) {
        this.f7476 = context;
        this.f7474 = c0834.f2958;
        this.f7471 = c0834.f2961;
        this.f7477 = c0834.f2953;
        this.f7472 = c0834.f2956.m8046();
        this.f7473 = new LinkedHashMap(c0834.f2971.f13752);
        this.f7480 = new C3066(c0834.f2974);
        if (c0834.f2963 == context) {
            this.f7475 = c0834.f2972;
            this.f7479 = c0834.f2975;
            this.f7478 = c0834.f2960;
        } else {
            this.f7475 = null;
            this.f7479 = null;
            this.f7478 = 0;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C0834 m4298() {
        Object obj = this.f7471;
        if (obj == null) {
            obj = C1397.f4785;
        }
        Object obj2 = obj;
        C3369 c3369 = this.f7477;
        C3294 c3294 = this.f7474;
        Bitmap.Config config = c3294.f11030;
        c3294.getClass();
        this.f7474.getClass();
        C5086 c5086 = this.f7472;
        C4714 c4714M8701 = c5086 != null ? c5086.m8701() : null;
        if (c4714M8701 == null) {
            c4714M8701 = AbstractC0080.f15149;
        } else {
            Bitmap.Config config2 = AbstractC0080.f15150;
        }
        C4714 c4714 = c4714M8701;
        LinkedHashMap linkedHashMap = this.f7473;
        C4130 c4130 = linkedHashMap != null ? new C4130(AbstractC2133.m4161(linkedHashMap)) : null;
        if (c4130 == null) {
            c4130 = C4130.f13751;
        }
        C4130 c4131 = c4130;
        this.f7474.getClass();
        this.f7474.getClass();
        this.f7474.getClass();
        this.f7474.getClass();
        this.f7474.getClass();
        C3294 c3295 = this.f7474;
        AbstractC2132 abstractC2132 = c3295.f11031;
        c3295.getClass();
        ExecutorC4540 executorC4540 = ExecutorC4540.f15006;
        this.f7474.getClass();
        this.f7474.getClass();
        AbstractC1434 abstractC1434Mo110 = this.f7475;
        Context context = this.f7476;
        if (abstractC1434Mo110 == null) {
            Object baseContext = context;
            while (true) {
                if (baseContext instanceof InterfaceC4507) {
                    abstractC1434Mo110 = ((InterfaceC4507) baseContext).mo110();
                    break;
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    abstractC1434Mo110 = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (abstractC1434Mo110 == null) {
                abstractC1434Mo110 = C1132.f3967;
            }
        }
        AbstractC1434 abstractC1434 = abstractC1434Mo110;
        C5895 c5895 = this.f7479;
        if (c5895 == null) {
            c5895 = new C5895(context);
        }
        C5895 c5896 = c5895;
        int i = this.f7478;
        if (i == 0) {
            i = 2;
        }
        int i2 = i;
        C3066 c3066 = this.f7480;
        C5311 c5311 = c3066 != null ? new C5311(AbstractC2133.m4161(c3066.f10306)) : null;
        if (c5311 == null) {
            c5311 = C5311.f17488;
        }
        return new C0834(context, obj2, c3369, config, 3, C4921.f16229, c4714, c4131, true, false, 1, 1, 1, abstractC2132, executorC4540, executorC4540, executorC4540, abstractC1434, c5896, i2, c5311, new C1063(), this.f7474);
    }

    public C2255(Context context) {
        this.f7476 = context;
        this.f7474 = AbstractC0040.f7816;
        this.f7471 = null;
        this.f7477 = null;
        this.f7472 = null;
        this.f7473 = null;
        this.f7480 = null;
        this.f7475 = null;
        this.f7479 = null;
        this.f7478 = 0;
    }
}
