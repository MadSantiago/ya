package p000;

import android.content.Context;
import android.content.Intent;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۦۘؔۢؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5024 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Context f16623;

    /* JADX INFO: renamed from: ۥُ */
    public final AtomicBoolean f16624;

    /* JADX INFO: renamed from: ۥّ */
    public int f16625;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4775 f16626;

    /* JADX INFO: renamed from: ۥۜ */
    public final C5845 f16627;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f16628;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4643 f16629;

    /* JADX INFO: renamed from: ۦِ */
    public final BinderC4715 f16630;

    /* JADX INFO: renamed from: ۦٛ */
    public final C3369 f16631;

    /* JADX INFO: renamed from: ۦۗ */
    public final ServiceConnectionC2110 f16632;

    /* JADX INFO: renamed from: ۦۙ */
    public InterfaceC2376 f16633;

    public C5024(Context context, String str, C4775 c4775) {
        this.f16628 = str;
        this.f16626 = c4775;
        this.f16623 = context.getApplicationContext();
        C3950 c3950 = c4775.f15744.f254;
        this.f16629 = c3950 == null ? null : c3950;
        this.f16624 = new AtomicBoolean(true);
        this.f16627 = AbstractC5568.m9356(0, 0, 1);
        this.f16631 = new C3369(15, this, c4775.f15742, false);
        this.f16630 = new BinderC4715(this);
        this.f16632 = new ServiceConnectionC2110(this);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8442(Intent intent) {
        if (this.f16624.compareAndSet(true, false)) {
            this.f16623.bindService(intent, this.f16632, 1);
            C4775 c4775 = this.f16626;
            LinkedHashMap linkedHashMap = c4775.f15745;
            C3757 c3757 = c4775.f15739;
            C3369 c3369 = this.f16631;
            C3869 c3869M6613 = c3757.m6613((String[]) c3369.f11255);
            String[] strArr = (String[]) c3869M6613.f12915;
            int[] iArr = (int[]) c3869M6613.f12914;
            C2916 c2916 = new C2916(c3369, iArr, strArr);
            ReentrantLock reentrantLock = c4775.f15740;
            reentrantLock.lock();
            try {
                C2916 c2917 = linkedHashMap.containsKey(c3369) ? (C2916) AbstractC4554.m7912(c3369, linkedHashMap) : (C2916) linkedHashMap.put(c3369, c2916);
                reentrantLock.unlock();
                if (c2917 == null) {
                    c3757.f12512.m2970(iArr);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
