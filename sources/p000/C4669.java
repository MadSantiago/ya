package p000;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦٜؑۙ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4669 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f15373;

    /* JADX INFO: renamed from: ۥّ */
    public Executor f15375;

    /* JADX INFO: renamed from: ۥۗ */
    public final Context f15376;

    /* JADX INFO: renamed from: ۥۜ */
    public C5322 f15377;

    /* JADX INFO: renamed from: ۦٛ */
    public boolean f15383;

    /* JADX INFO: renamed from: ۦۙ */
    public Executor f15385;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f15387;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f15388;

    /* JADX INFO: renamed from: ۦؑ */
    public final ArrayList f15379 = new ArrayList();

    /* JADX INFO: renamed from: ۥُ */
    public final ArrayList f15374 = new ArrayList();

    /* JADX INFO: renamed from: ۦِ */
    public final C3066 f15382 = new C3066(1);

    /* JADX INFO: renamed from: ۦۗ */
    public final LinkedHashSet f15384 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۦؚ */
    public final LinkedHashSet f15380 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۦٌ */
    public final ArrayList f15381 = new ArrayList();

    /* JADX INFO: renamed from: ۦۚ */
    public boolean f15386 = true;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3131 f15378 = AbstractC5041.m8557(WorkDatabase.class);

    public C4669(Context context, String str) {
        this.f15376 = context;
        this.f15373 = str;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8031(AbstractC4383... abstractC4383Arr) {
        for (AbstractC4383 abstractC4383 : abstractC4383Arr) {
            Integer numValueOf = Integer.valueOf(abstractC4383.f14450);
            LinkedHashSet linkedHashSet = this.f15380;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(abstractC4383.f14449));
        }
        for (AbstractC4383 abstractC4384 : (AbstractC4383[]) Arrays.copyOf(abstractC4383Arr, abstractC4383Arr.length)) {
            this.f15382.m5664(abstractC4384);
        }
    }
}
