package p000;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: ۦۦؗۢ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5789 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f19070;

    /* JADX INFO: renamed from: ۥُ */
    public final C2813 f19071;

    /* JADX INFO: renamed from: ۥّ */
    public final C3654 f19072;

    /* JADX INFO: renamed from: ۥۗ */
    public final Context f19073;

    /* JADX INFO: renamed from: ۥۜ */
    public final C0177 f19074;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4142 f19075;

    /* JADX INFO: renamed from: ۦؑ */
    public final C1489 f19076;

    /* JADX INFO: renamed from: ۦؚ */
    public final C3841 f19077;

    /* JADX INFO: renamed from: ۦِ */
    public final ArrayList f19078;

    /* JADX INFO: renamed from: ۦٛ */
    public final C1894 f19079;

    /* JADX INFO: renamed from: ۦۗ */
    public final String f19080;

    /* JADX INFO: renamed from: ۦۙ */
    public final WorkDatabase f19081;

    public C5789(C3571 c3571) {
        C4142 c4142 = (C4142) c3571.f11825;
        this.f19075 = c4142;
        this.f19073 = (Context) c3571.f11829;
        String str = c4142.f13787;
        this.f19070 = str;
        this.f19076 = (C1489) c3571.f11830;
        this.f19071 = (C2813) c3571.f11831;
        this.f19072 = (C3654) c3571.f11826;
        WorkDatabase workDatabase = (WorkDatabase) c3571.f11827;
        this.f19081 = workDatabase;
        this.f19074 = workDatabase.mo103();
        this.f19079 = workDatabase.mo86();
        ArrayList arrayList = (ArrayList) c3571.f11828;
        this.f19078 = arrayList;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(str);
        sb.append(", tags={ ");
        this.f19080 = AbstractC3761.m6621(sb, AbstractC0973.m2056(arrayList, ",", null, null, null, 62), " } ]");
        this.f19077 = AbstractC5568.m9366();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX INFO: renamed from: ۥؗ */
    public final Object m9603(AbstractC0772 abstractC0772) {
        C4169 c4169;
        OverwritingInputMerger overwritingInputMerger;
        C4142 c4142 = this.f19075;
        String str = c4142.f13776;
        String str2 = c4142.f13788;
        if (abstractC0772 instanceof C4169) {
            c4169 = (C4169) abstractC0772;
            int i = c4169.f13872;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4169.f13872 = i - Integer.MIN_VALUE;
            } else {
                c4169 = new C4169(this, abstractC0772);
            }
        } else {
            c4169 = new C4169(this, abstractC0772);
        }
        C4169 c41610 = c4169;
        Object objM5144 = c41610.f13871;
        int i2 = c41610.f13872;
        String str3 = this.f19080;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(objM5144);
                boolean zM9353 = AbstractC5568.m9353();
                String str4 = c4142.f13792;
                InterfaceC0443 interfaceC0443 = null;
                if (zM9353 && str4 != null) {
                    int iHashCode = c4142.hashCode();
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC4346.m7641(iHashCode, AbstractC5568.m9363(str4));
                    } else {
                        String strM9363 = AbstractC5568.m9363(str4);
                        try {
                            Method method = AbstractC5568.f18388;
                            if (method == null) {
                                method = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                AbstractC5568.f18388 = method;
                            }
                            method.invoke(null, Long.valueOf(AbstractC5568.f18385), strM9363, Integer.valueOf(iHashCode));
                        } catch (Exception e) {
                            AbstractC5568.m9350("asyncTraceBegin", e);
                        }
                    }
                }
                final int i3 = 0;
                Callable callable = new Callable(this) { // from class: ۥُٚؔٚ

                    /* JADX INFO: renamed from: ۦ۟ */
                    public final /* synthetic */ C5789 f5747;

                    {
                        this.f5747 = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i4 = i3;
                        EnumC4972 enumC4972 = EnumC4972.f16455;
                        C5789 c5789 = this.f5747;
                        switch (i4) {
                            case 0:
                                C4142 c4143 = c5789.f19075;
                                String str5 = c4143.f13776;
                                if (c4143.f13785 != enumC4972) {
                                    String str6 = AbstractC1537.f5202;
                                    C1984.m3874().m3878(str6, str5 + " is not in ENQUEUED state. Nothing more to do");
                                    return Boolean.TRUE;
                                }
                                if ((!c4143.m7323() && (c4143.f13785 != enumC4972 || c4143.f13795 <= 0)) || System.currentTimeMillis() >= c4143.m7324()) {
                                    return Boolean.FALSE;
                                }
                                C1984.m3874().m3878(AbstractC1537.f5202, "Delaying execution for " + str5 + " because it is being executed before schedule.");
                                return Boolean.TRUE;
                            default:
                                C0177 c0177 = c5789.f19074;
                                String str7 = c5789.f19070;
                                boolean z = false;
                                if (c0177.m379(str7) == enumC4972) {
                                    c0177.m376(EnumC4972.f16454, str7);
                                    ((Number) AbstractC0487.m1075(c0177.f663, false, true, new C3203(18, str7))).intValue();
                                    c0177.m377(-256, str7);
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                        }
                    }
                };
                WorkDatabase workDatabase = this.f19081;
                if (((Boolean) workDatabase.m105(callable)).booleanValue()) {
                    return new C5868();
                }
                boolean zM7323 = c4142.m7323();
                String str5 = this.f19070;
                if (!zM7323) {
                    String str6 = AbstractC1891.f6273;
                    try {
                        overwritingInputMerger = (OverwritingInputMerger) Class.forName(str2).getDeclaredConstructor(null).newInstance(null);
                    } catch (Exception e2) {
                        C1984.m3874().m3879(AbstractC1891.f6273, "Trouble instantiating ".concat(str2), e2);
                        overwritingInputMerger = null;
                    }
                    if (overwritingInputMerger == null) {
                        String str7 = AbstractC1537.f5202;
                        C1984.m3874().m3884(str7, "Could not create Input Merger " + str2);
                        return new C2524();
                    }
                    ArrayList arrayListM2049 = AbstractC0973.m2049(Collections.singletonList(c4142.f13778), (List) AbstractC0487.m1075(this.f19074.f663, true, false, new C3203(17, str5)));
                    C0697 c0697 = new C0697(0);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayListM2049.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.putAll(Collections.unmodifiableMap(((C2775) it.next()).f9250));
                    }
                    c0697.m1549(linkedHashMap);
                    AbstractC0993.m2142(new C2775(c0697.f2527));
                }
                UUID uuidFromString = UUID.fromString(str5);
                C2813 c2813 = this.f19071;
                ExecutorService executorService = (ExecutorService) c2813.f9393;
                C3654 c3654 = this.f19072;
                C1489 c1489 = this.f19076;
                C3114 c3114 = new C3114(workDatabase, c3654, c1489);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.f248 = uuidFromString;
                new HashSet(this.f19078);
                workerParameters.f247 = executorService;
                try {
                    Worker workerM1717 = ((AbstractC0821) c2813.f9388).m1717(this.f19073, str, workerParameters);
                    final int i4 = 1;
                    workerM1717.f246 = true;
                    InterfaceC3196 interfaceC3196 = (InterfaceC3196) c41610.f2791.mo865(C1397.f4791);
                    interfaceC3196.mo859(new C3316(3, workerM1717, str4, this, zM9353));
                    if (!((Boolean) workDatabase.m105(new Callable(this) { // from class: ۥُٚؔٚ

                        /* JADX INFO: renamed from: ۦ۟ */
                        public final /* synthetic */ C5789 f5747;

                        {
                            this.f5747 = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i5 = i4;
                            EnumC4972 enumC4972 = EnumC4972.f16455;
                            C5789 c5789 = this.f5747;
                            switch (i5) {
                                case 0:
                                    C4142 c4143 = c5789.f19075;
                                    String str8 = c4143.f13776;
                                    if (c4143.f13785 != enumC4972) {
                                        String str9 = AbstractC1537.f5202;
                                        C1984.m3874().m3878(str9, str8 + " is not in ENQUEUED state. Nothing more to do");
                                        return Boolean.TRUE;
                                    }
                                    if ((!c4143.m7323() && (c4143.f13785 != enumC4972 || c4143.f13795 <= 0)) || System.currentTimeMillis() >= c4143.m7324()) {
                                        return Boolean.FALSE;
                                    }
                                    C1984.m3874().m3878(AbstractC1537.f5202, "Delaying execution for " + str8 + " because it is being executed before schedule.");
                                    return Boolean.TRUE;
                                default:
                                    C0177 c0177 = c5789.f19074;
                                    String str10 = c5789.f19070;
                                    boolean z = false;
                                    if (c0177.m379(str10) == enumC4972) {
                                        c0177.m376(EnumC4972.f16454, str10);
                                        ((Number) AbstractC0487.m1075(c0177.f663, false, true, new C3203(18, str10))).intValue();
                                        c0177.m377(-256, str10);
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                            }
                        }
                    })).booleanValue()) {
                        return new C5868();
                    }
                    if (interfaceC3196.isCancelled()) {
                        return new C5868();
                    }
                    AbstractC2132 abstractC2132M7819 = AbstractC4489.m7819((ExecutorC0170) c1489.f5056);
                    C5416 c5416 = new C5416(this, workerM1717, c3114, interfaceC0443, 5);
                    c41610.f13872 = 1;
                    objM5144 = AbstractC2765.m5144(abstractC2132M7819, c5416, c41610);
                    EnumC2282 enumC2282 = EnumC2282.f7590;
                    if (objM5144 == enumC2282) {
                        return enumC2282;
                    }
                } catch (Throwable unused) {
                    String str8 = AbstractC1537.f5202;
                    C1984.m3874().m3884(str8, "Could not create Worker " + str);
                    return new C2524();
                }
            } else {
                if (i2 != 1) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(objM5144);
            }
            return new C5192((AbstractC0527) objM5144);
        } catch (CancellationException e3) {
            String str9 = AbstractC1537.f5202;
            C1984 c1984M3874 = C1984.m3874();
            String strConcat = str3.concat(" was cancelled");
            if (c1984M3874.f6551 <= 4) {
                Log.i(str9, strConcat, e3);
            }
            throw e3;
        } catch (Throwable th) {
            C1984.m3874().m3879(AbstractC1537.f5202, str3.concat(" failed because it threw an exception/error"), th);
            return new C2524();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m9604() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0177 c0177 = this.f19074;
        WorkDatabase workDatabase = c0177.f663;
        int i = 1;
        String str = this.f19070;
        AbstractC0487.m1075(workDatabase, false, true, new C2066(i, jCurrentTimeMillis, str));
        c0177.m376(EnumC4972.f16455, str);
        WorkDatabase workDatabase2 = c0177.f663;
        ((Number) AbstractC0487.m1075(workDatabase2, false, true, new C3203(15, str))).intValue();
        AbstractC0487.m1075(workDatabase2, false, true, new C2224(this.f19075.f13798, i, str));
        AbstractC0487.m1075(workDatabase2, false, true, new C3203(16, str));
        c0177.m380(-1L, str);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m9605(int i) {
        C0177 c0177 = this.f19074;
        EnumC4972 enumC4972 = EnumC4972.f16455;
        String str = this.f19070;
        c0177.m376(enumC4972, str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = c0177.f663;
        int i2 = 1;
        AbstractC0487.m1075(workDatabase, false, true, new C2066(i2, jCurrentTimeMillis, str));
        AbstractC0487.m1075(workDatabase, false, true, new C2224(this.f19075.f13798, i2, str));
        c0177.m380(-1L, str);
        c0177.m377(i, str);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m9606(AbstractC0527 abstractC0527) {
        String str = this.f19070;
        ArrayList arrayListM4193 = AbstractC2164.m4193(str);
        while (true) {
            boolean zIsEmpty = arrayListM4193.isEmpty();
            C0177 c0177 = this.f19074;
            if (zIsEmpty) {
                C2775 c2775 = ((C3297) abstractC0527).f11037;
                AbstractC0487.m1075(c0177.f663, false, true, new C2224(this.f19075.f13798, 1, str));
                AbstractC0487.m1075(c0177.f663, false, true, new C1708(23, c2775, str));
                return;
            }
            String str2 = (String) AbstractC3649.m6528(arrayListM4193);
            if (c0177.m379(str2) != EnumC4972.f16452) {
                c0177.m376(EnumC4972.f16451, str2);
            }
            arrayListM4193.addAll(this.f19079.m3746(str2));
        }
    }
}
