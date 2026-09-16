package p000;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: ۦۖؑ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4889 implements InterfaceC1025, InterfaceC3116, InterfaceC0978 {

    /* JADX INFO: renamed from: ۥً */
    public static final String f16086 = C1984.m3875("GreedyScheduler");

    /* JADX INFO: renamed from: ۥؓ */
    public final C1489 f16087;

    /* JADX INFO: renamed from: ۥؖ */
    public final C2391 f16088;

    /* JADX INFO: renamed from: ۥْ */
    public final C3336 f16090;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f16091;

    /* JADX INFO: renamed from: ۥٙ */
    public Boolean f16093;

    /* JADX INFO: renamed from: ۥۖ */
    public final C2813 f16094;

    /* JADX INFO: renamed from: ۥۧ */
    public final C1489 f16095;

    /* JADX INFO: renamed from: ۦٗ */
    public final C3654 f16097;

    /* JADX INFO: renamed from: ۦۛ */
    public final C2346 f16098;

    /* JADX INFO: renamed from: ۦۨ */
    public final Context f16100;

    /* JADX INFO: renamed from: ۦ۟ */
    public final HashMap f16099 = new HashMap();

    /* JADX INFO: renamed from: ۥَ */
    public final Object f16089 = new Object();

    /* JADX INFO: renamed from: ۥٖ */
    public final C2346 f16092 = new C2346(new C3066(2));

    /* JADX INFO: renamed from: ۦٕ */
    public final HashMap f16096 = new HashMap();

    public C4889(Context context, C2813 c2813, C1414 c1414, C3654 c3654, C2346 c2346, C1489 c1489) {
        this.f16100 = context;
        C4228 c4228 = (C4228) c2813.f9391;
        this.f16090 = new C3336(this, c4228, (C4575) c2813.f9390);
        this.f16095 = new C1489(c4228, c2346);
        this.f16087 = c1489;
        this.f16088 = new C2391(c1414);
        this.f16094 = c2813;
        this.f16097 = c3654;
        this.f16098 = c2346;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [ۥَؕؒٝ, ۦؙٟؓ] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // p000.InterfaceC1025
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2234(C4142... c4142Arr) {
        ?? r7;
        ?? r4;
        int i;
        long jMax;
        Boolean boolValueOf = this.f16093;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(AbstractC1230.m2596(this.f16100));
            this.f16093 = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            C1984.m3874().m3883(f16086, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f16091) {
            this.f16097.m6533(this);
            this.f16091 = true;
        }
        HashSet<C4142> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int length = c4142Arr.length;
        int i2 = 0;
        while (true) {
            r7 = 0;
            ?? r8 = 0;
            if (i2 >= length) {
                break;
            }
            C4142 c4142 = c4142Arr[i2];
            if (!this.f16092.m4410(AbstractC0993.m2155(c4142))) {
                synchronized (this.f16089) {
                    try {
                        C1860 c1860M2155 = AbstractC0993.m2155(c4142);
                        C5016 c5016 = (C5016) this.f16096.get(c1860M2155);
                        if (c5016 == null) {
                            int i3 = c4142.f13795;
                            Object obj = this.f16094.f9390;
                            c5016 = new C5016(System.currentTimeMillis(), i3);
                            this.f16096.put(c1860M2155, c5016);
                        }
                        long j = c5016.f16597;
                        int i4 = c4142.f13795 - c5016.f16598;
                        i = 5;
                        jMax = (((long) Math.max(i4 - 5, 0)) * 30000) + j;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(c4142.m7324(), jMax);
                Object obj2 = this.f16094.f9390;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c4142.f13785 == EnumC4972.f16455) {
                    if (jCurrentTimeMillis < jMax2) {
                        C3336 c3336 = this.f16090;
                        if (c3336 != null) {
                            C4228 c4228 = c3336.f11161;
                            HashMap map = c3336.f11160;
                            Runnable runnable = (Runnable) map.remove(c4142.f13787);
                            if (runnable != null) {
                                ((Handler) c4228.f14025).removeCallbacks(runnable);
                            }
                            RunnableC4985 runnableC4985 = new RunnableC4985(7, c3336, c4142, false);
                            map.put(c4142.f13787, runnableC4985);
                            ((Handler) c4228.f14025).postDelayed(runnableC4985, jMax2 - System.currentTimeMillis());
                        }
                    } else if (!AbstractC3831.m6874(C4628.f15275, c4142.f13791)) {
                        C4628 c4628 = c4142.f13791;
                        if (c4628.f15282) {
                            C1984.m3874().m3878(f16086, "Ignoring " + c4142 + ". Requires device idle.");
                        } else if (c4628.f15283.isEmpty()) {
                            hashSet.add(c4142);
                            hashSet2.add(c4142.f13787);
                        } else {
                            C1984.m3874().m3878(f16086, "Ignoring " + c4142 + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f16092.m4410(AbstractC0993.m2155(c4142))) {
                        C1984.m3874().m3878(f16086, "Starting work for " + c4142.f13787);
                        C2666 c2666M4403 = this.f16092.m4403(AbstractC0993.m2155(c4142));
                        this.f16095.m3126(c2666M4403);
                        C2346 c2346 = this.f16098;
                        ((ExecutorC2205) ((C1489) c2346.f7785).f5059).execute(new RunnableC3599(c2346, c2666M4403, r8 == true ? 1 : 0, i));
                    }
                }
            }
            i2++;
        }
        synchronized (this.f16089) {
            try {
                if (!hashSet.isEmpty()) {
                    String strJoin = TextUtils.join(",", hashSet2);
                    C1984.m3874().m3878(f16086, "Starting tracking for " + strJoin);
                    for (C4142 c4143 : hashSet) {
                        C1860 c1860M2156 = AbstractC0993.m2155(c4143);
                        if (this.f16099.containsKey(c1860M2156)) {
                            r4 = r7;
                        } else {
                            C2391 c2391 = this.f16088;
                            AbstractC2132 abstractC2132 = (AbstractC2132) this.f16087.f5057;
                            String str = AbstractC3182.f10689;
                            r4 = r7;
                            this.f16099.put(c1860M2156, AbstractC2765.m5135(AbstractC4009.m7151(abstractC2132), r4, 0, new C5416(c2391, c4143, this, r4, 4), 3));
                        }
                        r7 = r4;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC1025
    /* JADX INFO: renamed from: ۥُ */
    public final boolean mo2235() {
        return false;
    }

    @Override // p000.InterfaceC3116
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo5696(C4142 c4142, AbstractC3750 abstractC3750) {
        C1860 c1860M2155 = AbstractC0993.m2155(c4142);
        boolean z = abstractC3750 instanceof C1385;
        C2346 c2346 = this.f16098;
        C1489 c1489 = this.f16095;
        String str = f16086;
        C2346 c2347 = this.f16092;
        if (!z) {
            C1984.m3874().m3878(str, "Constraints not met: Cancelling work ID " + c1860M2155);
            C2666 c2666M4417 = c2347.m4417(c1860M2155);
            if (c2666M4417 != null) {
                c1489.m3143(c2666M4417);
                c2346.m4412(c2666M4417, ((C4495) abstractC3750).f14869);
                return;
            }
            return;
        }
        if (c2347.m4410(c1860M2155)) {
            return;
        }
        C1984.m3874().m3878(str, "Constraints met: Scheduling work ID " + c1860M2155);
        C2666 c2666M4403 = c2347.m4403(c1860M2155);
        c1489.m3126(c2666M4403);
        ((ExecutorC2205) ((C1489) c2346.f7785).f5059).execute(new RunnableC3599(c2346, c2666M4403, null, 5));
    }

    @Override // p000.InterfaceC1025
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2236(String str) {
        List<C2666> listM5662;
        Runnable runnable;
        String str2 = f16086;
        Boolean boolValueOf = this.f16093;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(AbstractC1230.m2596(this.f16100));
            this.f16093 = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            C1984.m3874().m3883(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f16091) {
            this.f16097.m6533(this);
            this.f16091 = true;
        }
        C1984.m3874().m3878(str2, "Cancelling work ID " + str);
        C3336 c3336 = this.f16090;
        if (c3336 != null && (runnable = (Runnable) c3336.f11160.remove(str)) != null) {
            ((Handler) c3336.f11161.f14025).removeCallbacks(runnable);
        }
        C2346 c2346 = this.f16092;
        synchronized (c2346.f7785) {
            listM5662 = ((C3066) c2346.f7786).m5662(str);
        }
        for (C2666 c2666 : listM5662) {
            this.f16095.m3143(c2666);
            this.f16098.m4412(c2666, -512);
        }
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo108(C1860 c1860, boolean z) {
        InterfaceC3196 interfaceC3196;
        C2666 c2666M4417 = this.f16092.m4417(c1860);
        if (c2666M4417 != null) {
            this.f16095.m3143(c2666M4417);
        }
        synchronized (this.f16089) {
            interfaceC3196 = (InterfaceC3196) this.f16099.remove(c1860);
        }
        if (interfaceC3196 != null) {
            C1984.m3874().m3878(f16086, "Stopping tracking for " + c1860);
            interfaceC3196.mo871(null);
        }
        if (z) {
            return;
        }
        synchronized (this.f16089) {
            this.f16096.remove(c1860);
        }
    }
}
