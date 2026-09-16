package p000;

import android.content.Intent;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۦٝۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4775 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3757 f15739;

    /* JADX INFO: renamed from: ۥُ */
    public final ReentrantLock f15740;

    /* JADX INFO: renamed from: ۥّ */
    public final C0871 f15741;

    /* JADX INFO: renamed from: ۥۗ */
    public final String[] f15742;

    /* JADX INFO: renamed from: ۥۜ */
    public Intent f15743;

    /* JADX INFO: renamed from: ۥۣ */
    public final WorkDatabase_Impl f15744;

    /* JADX INFO: renamed from: ۦؑ */
    public final LinkedHashMap f15745;

    /* JADX INFO: renamed from: ۦِ */
    public final Object f15746;

    /* JADX INFO: renamed from: ۦٛ */
    public C5024 f15747;

    /* JADX INFO: renamed from: ۦۙ */
    public final C0871 f15748;

    public C4775(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.f15744 = workDatabase_Impl;
        this.f15742 = strArr;
        C3757 c3757 = new C3757(workDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, workDatabase_Impl.f256, new C0037(1, this, C4775.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 12));
        this.f15739 = c3757;
        this.f15745 = new LinkedHashMap();
        this.f15740 = new ReentrantLock();
        this.f15741 = new C0871(3, this);
        this.f15748 = new C0871(4, this);
        Collections.newSetFromMap(new IdentityHashMap());
        this.f15746 = new Object();
        c3757.f12517 = new C0101(18, this);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object m8159(AbstractC2426 abstractC2426) {
        Object objM6609;
        WorkDatabase_Impl workDatabase_Impl = this.f15744;
        return ((!workDatabase_Impl.m97() || workDatabase_Impl.m96()) && (objM6609 = this.f15739.m6609(abstractC2426)) == EnumC2282.f7590) ? objM6609 : C2358.f7817;
    }
}
