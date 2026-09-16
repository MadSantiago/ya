package p000;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: ۦؐؗۥۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3001 {

    /* JADX INFO: renamed from: ۥۜ */
    public static final C4601 f10092 = new C4601(1);

    /* JADX INFO: renamed from: ۦٛ */
    public static final C0613 f10093;

    /* JADX INFO: renamed from: ۥؗ */
    public final String f10094;

    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC4821 f10095;

    /* JADX INFO: renamed from: ۥّ */
    public final C0352 f10096;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0996 f10097;

    /* JADX INFO: renamed from: ۥۣ */
    public volatile C4752 f10098;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f10099;

    /* JADX INFO: renamed from: ۦۙ */
    public final C5460 f10100;

    static {
        C5816 c5816 = C5816.f19147;
        int i = AbstractC4821.f15885;
        f10093 = new C0613(c5816, false, C2745.f9080);
    }

    public C3001(C0996 c0996, C0613 c0613) {
        this.f10097 = c0996;
        Context context = c0996.f3561;
        String str = c0613.f2293;
        if (str == null) {
            str = (String) c0613.f2292.apply(context);
            c0613.f2293 = str;
        }
        this.f10094 = str;
        this.f10099 = c0613.f2291;
        this.f10095 = c0613.f2290;
        this.f10098 = null;
        this.f10096 = new C0352(1);
        this.f10100 = new C5460(c0996, str);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m5591() {
        C5460 c5460 = this.f10100;
        C0996 c0996 = (C0996) c5460.f18001;
        C2022 c2022 = (C2022) c0996.f3564.get();
        String str = (String) c5460.f18000;
        c2022.getClass();
        str.getClass();
        C1543 c1543 = c2022.f6662;
        C5470 c5470M9153 = C5470.m9153();
        c5470M9153.f18034 = new C5536(3, str);
        C0008 c0008M3941 = C2022.m3941(c1543.m7829(0, c5470M9153.m9158()).m6386(EnumC0486.f1767, new C5518(21)));
        C5816 c5816 = C5816.f19150;
        ScheduledExecutorServiceC3499 scheduledExecutorServiceC3499M2177 = c0996.m2177();
        int i = AbstractRunnableC0022.f4488;
        C0081 c0081 = new C0081(c0008M3941, c5816);
        c0008M3941.mo3760(c0081, AbstractC0993.m2137(scheduledExecutorServiceC3499M2177, c0081));
        C1019 c1019 = new C1019(1, c5460);
        C0996 c0997 = this.f10097;
        AbstractRunnableC0022.m2771(c0081, c1019, c0997.m2177()).mo3760(new RunnableC5413(9, this, c0081), c0997.m2177());
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C4752 m5592() {
        C4752 c4752;
        C4752 c4753 = this.f10098;
        if (c4753 != null) {
            return c4753;
        }
        synchronized (this) {
            try {
                c4752 = this.f10098;
                if (c4752 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        C4752 c4752M9124 = this.f10100.m9124();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        int i = ((C2268) c4752M9124.f15685).f7526 - 2;
                        if (i == 15 || i == 16) {
                            c4752 = c4752M9124;
                        } else {
                            C0996 c0996 = this.f10097;
                            c0996.f3566.m6953();
                            if (this.f10099 || this.f10100.m9131() || !((String) c4752M9124.f15686).isEmpty()) {
                                final int i2 = 2;
                                c0996.m2177().execute(new Runnable(this) { // from class: ۥٖؕۜؑ

                                    /* JADX INFO: renamed from: ۦ۟ */
                                    public final /* synthetic */ C3001 f5006;

                                    {
                                        this.f5006 = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC5352 abstractC5352M3942;
                                        C0008 c0008M3941;
                                        int i3 = i2;
                                        int i4 = 26;
                                        C3001 c3001 = this.f5006;
                                        switch (i3) {
                                            case 0:
                                                c3001.m5591();
                                                return;
                                            case 1:
                                                final C2183 c2183 = c3001.f10097.f3565;
                                                boolean z = c3001.f10099;
                                                C0128 c0128 = C0128.f532;
                                                final InterfaceC2735 interfaceC2735 = (InterfaceC2735) c2183.f7232.get();
                                                if (interfaceC2735 == null && !z) {
                                                    C4286 c4286 = C4286.f14174;
                                                    return;
                                                }
                                                if ((c2183.f7233 & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = c2183.f7234;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i5 = c2183.f7233;
                                                            if ((i5 & 64) == 0) {
                                                                copyOnWriteArrayList.add(c0128);
                                                                c2183.f7233 = i5 | 64;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (c2183.f7236 == null) {
                                                    synchronized (c2183.f7239) {
                                                        try {
                                                            if (c2183.f7236 == null) {
                                                                if (interfaceC2735 == null) {
                                                                    interfaceC2735 = C1990.f6568;
                                                                }
                                                                Context context = c2183.f7237;
                                                                if (AbstractC0949.m1942(context)) {
                                                                    abstractC5352M3942 = ((C2022) c2183.f7238.get()).m3942(new C0430(c2183, interfaceC2735));
                                                                    c2183.f7236 = abstractC5352M3942;
                                                                } else {
                                                                    RunnableC2054 runnableC2054 = RunnableC2054.f6767;
                                                                    InterfaceC3077 interfaceC3077 = c2183.f7235;
                                                                    abstractC5352M3942 = AbstractRunnableC0022.m2771(AbstractC0949.m1937(context, Executors.callable(runnableC2054, null), (Executor) interfaceC3077.get()), new InterfaceC5296() { // from class: ۥؚٚۘ
                                                                        @Override // p000.InterfaceC5296
                                                                        public final InterfaceFutureC4378 apply(Object obj) {
                                                                            C2183 c2184 = c2183;
                                                                            return ((C2022) c2184.f7238.get()).m3942(new C0430(c2184, interfaceC2735));
                                                                        }
                                                                    }, (Executor) interfaceC3077.get());
                                                                    c2183.f7236 = abstractC5352M3942;
                                                                }
                                                                abstractC5352M3942.mo3760(new RunnableC3365(i4, abstractC5352M3942), (Executor) c2183.f7235.get());
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                C4752 c4752M5592 = c3001.m5592();
                                                String str = (String) c4752M5592.f15686;
                                                C0996 c0997 = c3001.f10097;
                                                InterfaceC3077 interfaceC3078 = c0997.f3564;
                                                C4471 c4471M6952 = c0997.f3566.m6952();
                                                boolean z2 = c4471M6952.f14746;
                                                int i6 = 0;
                                                if (c4471M6952.f14745) {
                                                    int i7 = AbstractC4239.f14045;
                                                    if ((str == null || str.isEmpty()) && !z2) {
                                                        C4286 c4287 = C4286.f14174;
                                                        return;
                                                    }
                                                    C5588 c5588M9111 = C5437.m9111();
                                                    C2268 c2268 = (C2268) c4752M5592.f15685;
                                                    int i8 = c2268.f7527;
                                                    C3640 c3640M8734 = C5104.m8734();
                                                    c3640M8734.m1979();
                                                    ((C5104) c3640M8734.f3388).m8735(i8);
                                                    int i9 = c2268.f7526;
                                                    c3640M8734.m1979();
                                                    ((C5104) c3640M8734.f3388).m8736(i9);
                                                    C5104 c5104 = (C5104) c3640M8734.m1977();
                                                    c5588M9111.m1979();
                                                    ((C5437) c5588M9111.f3388).m9114(c5104);
                                                    if (str != null && !str.isEmpty()) {
                                                        c5588M9111.m1979();
                                                        ((C5437) c5588M9111.f3388).m9113(str);
                                                    }
                                                    if (z2) {
                                                        String str2 = c3001.f10094;
                                                        c5588M9111.m1979();
                                                        ((C5437) c5588M9111.f3388).m9115(str2);
                                                    }
                                                    C2022 c2022 = (C2022) interfaceC3078.get();
                                                    C5437 c5437 = (C5437) c5588M9111.m1977();
                                                    C1543 c1543 = c2022.f6662;
                                                    C5470 c5470M9153 = C5470.m9153();
                                                    c5470M9153.f18034 = new C2391(10, c5437);
                                                    c5470M9153.f18037 = new C2274[]{AbstractC0186.f680};
                                                    c5470M9153.f18035 = false;
                                                    c0008M3941 = C2022.m3941(c1543.m7829(0, c5470M9153.m9158()).m6392(EnumC0486.f1767, new C2346(i4, c1543, c5437)));
                                                } else {
                                                    int i10 = AbstractC4239.f14045;
                                                    if (str == null || str.isEmpty()) {
                                                        C4286 c4288 = C4286.f14174;
                                                        return;
                                                    }
                                                    C2022 c2023 = (C2022) interfaceC3078.get();
                                                    c2023.getClass();
                                                    str.getClass();
                                                    c0008M3941 = C2022.m3941(c2023.f6662.m3293(str));
                                                }
                                                C1019 c1019 = new C1019(i6, c3001);
                                                ScheduledExecutorServiceC3499 scheduledExecutorServiceC3499M2177 = c0997.m2177();
                                                int i11 = AbstractRunnableC0049.f9490;
                                                C0008 c0008 = new C0008(c0008M3941, C3849.class, c1019);
                                                c0008M3941.mo3760(c0008, AbstractC0993.m2137(scheduledExecutorServiceC3499M2177, c0008));
                                                return;
                                        }
                                    }
                                });
                                c0996.f3563.m9130((AbstractC4314) c4752M9124.f15684, this.f10095, this.f10094);
                                if (this.f10100.m9131()) {
                                    final int i3 = 1;
                                    c0996.m2177().execute(new Runnable(this) { // from class: ۥٖؕۜؑ

                                        /* JADX INFO: renamed from: ۦ۟ */
                                        public final /* synthetic */ C3001 f5006;

                                        {
                                            this.f5006 = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            AbstractC5352 abstractC5352M3942;
                                            C0008 c0008M3941;
                                            int i4 = i3;
                                            int i5 = 26;
                                            C3001 c3001 = this.f5006;
                                            switch (i4) {
                                                case 0:
                                                    c3001.m5591();
                                                    return;
                                                case 1:
                                                    final C2183 c2183 = c3001.f10097.f3565;
                                                    boolean z = c3001.f10099;
                                                    C0128 c0128 = C0128.f532;
                                                    final InterfaceC2735 interfaceC2735 = (InterfaceC2735) c2183.f7232.get();
                                                    if (interfaceC2735 == null && !z) {
                                                        C4286 c4286 = C4286.f14174;
                                                        return;
                                                    }
                                                    if ((c2183.f7233 & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = c2183.f7234;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i6 = c2183.f7233;
                                                                if ((i6 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(c0128);
                                                                    c2183.f7233 = i6 | 64;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (c2183.f7236 == null) {
                                                        synchronized (c2183.f7239) {
                                                            try {
                                                                if (c2183.f7236 == null) {
                                                                    if (interfaceC2735 == null) {
                                                                        interfaceC2735 = C1990.f6568;
                                                                    }
                                                                    Context context = c2183.f7237;
                                                                    if (AbstractC0949.m1942(context)) {
                                                                        abstractC5352M3942 = ((C2022) c2183.f7238.get()).m3942(new C0430(c2183, interfaceC2735));
                                                                        c2183.f7236 = abstractC5352M3942;
                                                                    } else {
                                                                        RunnableC2054 runnableC2054 = RunnableC2054.f6767;
                                                                        InterfaceC3077 interfaceC3077 = c2183.f7235;
                                                                        abstractC5352M3942 = AbstractRunnableC0022.m2771(AbstractC0949.m1937(context, Executors.callable(runnableC2054, null), (Executor) interfaceC3077.get()), new InterfaceC5296() { // from class: ۥؚٚۘ
                                                                            @Override // p000.InterfaceC5296
                                                                            public final InterfaceFutureC4378 apply(Object obj) {
                                                                                C2183 c2184 = c2183;
                                                                                return ((C2022) c2184.f7238.get()).m3942(new C0430(c2184, interfaceC2735));
                                                                            }
                                                                        }, (Executor) interfaceC3077.get());
                                                                        c2183.f7236 = abstractC5352M3942;
                                                                    }
                                                                    abstractC5352M3942.mo3760(new RunnableC3365(i5, abstractC5352M3942), (Executor) c2183.f7235.get());
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    C4752 c4752M5592 = c3001.m5592();
                                                    String str = (String) c4752M5592.f15686;
                                                    C0996 c0997 = c3001.f10097;
                                                    InterfaceC3077 interfaceC3078 = c0997.f3564;
                                                    C4471 c4471M6952 = c0997.f3566.m6952();
                                                    boolean z2 = c4471M6952.f14746;
                                                    int i7 = 0;
                                                    if (c4471M6952.f14745) {
                                                        int i8 = AbstractC4239.f14045;
                                                        if ((str == null || str.isEmpty()) && !z2) {
                                                            C4286 c4287 = C4286.f14174;
                                                            return;
                                                        }
                                                        C5588 c5588M9111 = C5437.m9111();
                                                        C2268 c2268 = (C2268) c4752M5592.f15685;
                                                        int i9 = c2268.f7527;
                                                        C3640 c3640M8734 = C5104.m8734();
                                                        c3640M8734.m1979();
                                                        ((C5104) c3640M8734.f3388).m8735(i9);
                                                        int i10 = c2268.f7526;
                                                        c3640M8734.m1979();
                                                        ((C5104) c3640M8734.f3388).m8736(i10);
                                                        C5104 c5104 = (C5104) c3640M8734.m1977();
                                                        c5588M9111.m1979();
                                                        ((C5437) c5588M9111.f3388).m9114(c5104);
                                                        if (str != null && !str.isEmpty()) {
                                                            c5588M9111.m1979();
                                                            ((C5437) c5588M9111.f3388).m9113(str);
                                                        }
                                                        if (z2) {
                                                            String str2 = c3001.f10094;
                                                            c5588M9111.m1979();
                                                            ((C5437) c5588M9111.f3388).m9115(str2);
                                                        }
                                                        C2022 c2022 = (C2022) interfaceC3078.get();
                                                        C5437 c5437 = (C5437) c5588M9111.m1977();
                                                        C1543 c1543 = c2022.f6662;
                                                        C5470 c5470M9153 = C5470.m9153();
                                                        c5470M9153.f18034 = new C2391(10, c5437);
                                                        c5470M9153.f18037 = new C2274[]{AbstractC0186.f680};
                                                        c5470M9153.f18035 = false;
                                                        c0008M3941 = C2022.m3941(c1543.m7829(0, c5470M9153.m9158()).m6392(EnumC0486.f1767, new C2346(i5, c1543, c5437)));
                                                    } else {
                                                        int i11 = AbstractC4239.f14045;
                                                        if (str == null || str.isEmpty()) {
                                                            C4286 c4288 = C4286.f14174;
                                                            return;
                                                        }
                                                        C2022 c2023 = (C2022) interfaceC3078.get();
                                                        c2023.getClass();
                                                        str.getClass();
                                                        c0008M3941 = C2022.m3941(c2023.f6662.m3293(str));
                                                    }
                                                    C1019 c1019 = new C1019(i7, c3001);
                                                    ScheduledExecutorServiceC3499 scheduledExecutorServiceC3499M2177 = c0997.m2177();
                                                    int i12 = AbstractRunnableC0049.f9490;
                                                    C0008 c0008 = new C0008(c0008M3941, C3849.class, c1019);
                                                    c0008M3941.mo3760(c0008, AbstractC0993.m2137(scheduledExecutorServiceC3499M2177, c0008));
                                                    return;
                                            }
                                        }
                                    });
                                }
                                c4752 = c4752M9124;
                            } else {
                                final int i4 = 0;
                                c0996.m2177().execute(new Runnable(this) { // from class: ۥٖؕۜؑ

                                    /* JADX INFO: renamed from: ۦ۟ */
                                    public final /* synthetic */ C3001 f5006;

                                    {
                                        this.f5006 = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC5352 abstractC5352M3942;
                                        C0008 c0008M3941;
                                        int i5 = i4;
                                        int i6 = 26;
                                        C3001 c3001 = this.f5006;
                                        switch (i5) {
                                            case 0:
                                                c3001.m5591();
                                                return;
                                            case 1:
                                                final C2183 c2183 = c3001.f10097.f3565;
                                                boolean z = c3001.f10099;
                                                C0128 c0128 = C0128.f532;
                                                final InterfaceC2735 interfaceC2735 = (InterfaceC2735) c2183.f7232.get();
                                                if (interfaceC2735 == null && !z) {
                                                    C4286 c4286 = C4286.f14174;
                                                    return;
                                                }
                                                if ((c2183.f7233 & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = c2183.f7234;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i7 = c2183.f7233;
                                                            if ((i7 & 64) == 0) {
                                                                copyOnWriteArrayList.add(c0128);
                                                                c2183.f7233 = i7 | 64;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (c2183.f7236 == null) {
                                                    synchronized (c2183.f7239) {
                                                        try {
                                                            if (c2183.f7236 == null) {
                                                                if (interfaceC2735 == null) {
                                                                    interfaceC2735 = C1990.f6568;
                                                                }
                                                                Context context = c2183.f7237;
                                                                if (AbstractC0949.m1942(context)) {
                                                                    abstractC5352M3942 = ((C2022) c2183.f7238.get()).m3942(new C0430(c2183, interfaceC2735));
                                                                    c2183.f7236 = abstractC5352M3942;
                                                                } else {
                                                                    RunnableC2054 runnableC2054 = RunnableC2054.f6767;
                                                                    InterfaceC3077 interfaceC3077 = c2183.f7235;
                                                                    abstractC5352M3942 = AbstractRunnableC0022.m2771(AbstractC0949.m1937(context, Executors.callable(runnableC2054, null), (Executor) interfaceC3077.get()), new InterfaceC5296() { // from class: ۥؚٚۘ
                                                                        @Override // p000.InterfaceC5296
                                                                        public final InterfaceFutureC4378 apply(Object obj) {
                                                                            C2183 c2184 = c2183;
                                                                            return ((C2022) c2184.f7238.get()).m3942(new C0430(c2184, interfaceC2735));
                                                                        }
                                                                    }, (Executor) interfaceC3077.get());
                                                                    c2183.f7236 = abstractC5352M3942;
                                                                }
                                                                abstractC5352M3942.mo3760(new RunnableC3365(i6, abstractC5352M3942), (Executor) c2183.f7235.get());
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                C4752 c4752M5592 = c3001.m5592();
                                                String str = (String) c4752M5592.f15686;
                                                C0996 c0997 = c3001.f10097;
                                                InterfaceC3077 interfaceC3078 = c0997.f3564;
                                                C4471 c4471M6952 = c0997.f3566.m6952();
                                                boolean z2 = c4471M6952.f14746;
                                                int i8 = 0;
                                                if (c4471M6952.f14745) {
                                                    int i9 = AbstractC4239.f14045;
                                                    if ((str == null || str.isEmpty()) && !z2) {
                                                        C4286 c4287 = C4286.f14174;
                                                        return;
                                                    }
                                                    C5588 c5588M9111 = C5437.m9111();
                                                    C2268 c2268 = (C2268) c4752M5592.f15685;
                                                    int i10 = c2268.f7527;
                                                    C3640 c3640M8734 = C5104.m8734();
                                                    c3640M8734.m1979();
                                                    ((C5104) c3640M8734.f3388).m8735(i10);
                                                    int i11 = c2268.f7526;
                                                    c3640M8734.m1979();
                                                    ((C5104) c3640M8734.f3388).m8736(i11);
                                                    C5104 c5104 = (C5104) c3640M8734.m1977();
                                                    c5588M9111.m1979();
                                                    ((C5437) c5588M9111.f3388).m9114(c5104);
                                                    if (str != null && !str.isEmpty()) {
                                                        c5588M9111.m1979();
                                                        ((C5437) c5588M9111.f3388).m9113(str);
                                                    }
                                                    if (z2) {
                                                        String str2 = c3001.f10094;
                                                        c5588M9111.m1979();
                                                        ((C5437) c5588M9111.f3388).m9115(str2);
                                                    }
                                                    C2022 c2022 = (C2022) interfaceC3078.get();
                                                    C5437 c5437 = (C5437) c5588M9111.m1977();
                                                    C1543 c1543 = c2022.f6662;
                                                    C5470 c5470M9153 = C5470.m9153();
                                                    c5470M9153.f18034 = new C2391(10, c5437);
                                                    c5470M9153.f18037 = new C2274[]{AbstractC0186.f680};
                                                    c5470M9153.f18035 = false;
                                                    c0008M3941 = C2022.m3941(c1543.m7829(0, c5470M9153.m9158()).m6392(EnumC0486.f1767, new C2346(i6, c1543, c5437)));
                                                } else {
                                                    int i12 = AbstractC4239.f14045;
                                                    if (str == null || str.isEmpty()) {
                                                        C4286 c4288 = C4286.f14174;
                                                        return;
                                                    }
                                                    C2022 c2023 = (C2022) interfaceC3078.get();
                                                    c2023.getClass();
                                                    str.getClass();
                                                    c0008M3941 = C2022.m3941(c2023.f6662.m3293(str));
                                                }
                                                C1019 c1019 = new C1019(i8, c3001);
                                                ScheduledExecutorServiceC3499 scheduledExecutorServiceC3499M2177 = c0997.m2177();
                                                int i13 = AbstractRunnableC0049.f9490;
                                                C0008 c0008 = new C0008(c0008M3941, C3849.class, c1019);
                                                c0008M3941.mo3760(c0008, AbstractC0993.m2137(scheduledExecutorServiceC3499M2177, c0008));
                                                return;
                                        }
                                    }
                                });
                                c4752 = new C4752(C0268.m548(), (C2268) c4752M9124.f15685);
                            }
                        }
                        if (!this.f10099 || ((C2268) c4752.f15685).f7526 != 17) {
                            this.f10098 = c4752;
                        }
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4752;
    }
}
