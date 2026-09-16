package p000;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.function.Predicate;

/* JADX INFO: renamed from: ۦَؙٕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3571 implements InterfaceC4844, InterfaceC4895 {

    /* JADX INFO: renamed from: ۦۛ */
    public static final C4668 f11824 = new C4668(0);

    /* JADX INFO: renamed from: ۥَ */
    public Object f11825;

    /* JADX INFO: renamed from: ۥْ */
    public Object f11826;

    /* JADX INFO: renamed from: ۥٓ */
    public Object f11827;

    /* JADX INFO: renamed from: ۥٖ */
    public Object f11828;

    /* JADX INFO: renamed from: ۦٗ */
    public Object f11829;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f11830;

    /* JADX INFO: renamed from: ۦۨ */
    public Object f11831;

    public /* synthetic */ C3571(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f11831 = obj;
        this.f11830 = obj2;
        this.f11826 = obj3;
        this.f11827 = obj4;
        this.f11825 = obj5;
        this.f11828 = obj6;
        this.f11829 = obj7;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static C3302 m6363(C3302 c3302, C5002 c5002, C2711 c2711, Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Map mapUnmodifiableMap3;
        C4725 c4725M6061 = c3302.m6061();
        String strMo3587 = ((InterfaceC1804) c5002.f16550).mo3587();
        if (strMo3587 != null) {
            c4725M6061.f15597 = new C4856(strMo3587);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean zIsEmpty = map.isEmpty();
        C1405 c1405 = (C1405) c2711.f8981;
        if (zIsEmpty) {
            C5911 c5911 = (C5911) ((AtomicMarkableReference) c1405.f4836).getReference();
            synchronized (c5911) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(c5911.f19498));
            }
        } else {
            C5911 c5912 = (C5911) ((AtomicMarkableReference) c1405.f4836).getReference();
            synchronized (c5912) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(c5912.f19498));
            }
            HashMap map2 = new HashMap(mapUnmodifiableMap);
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strM9735 = C5911.m9735(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strM9735)) {
                    map2.put(strM9735, C5911.m9735(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        }
        List listM6367 = m6367(mapUnmodifiableMap2);
        C5911 c5913 = (C5911) ((AtomicMarkableReference) ((C1405) c2711.f8979).f4836).getReference();
        synchronized (c5913) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(c5913.f19498));
        }
        List listM6368 = m6367(mapUnmodifiableMap3);
        if (!listM6367.isEmpty() || !listM6368.isEmpty()) {
            C1771 c1771Mo5025 = c3302.f11052.mo5025();
            c1771Mo5025.f5906 = listM6367;
            c1771Mo5025.f5903 = listM6368;
            c4725M6061.f15596 = c1771Mo5025.m3562();
        }
        return c4725M6061.m8054();
    }

    /* JADX INFO: renamed from: ۦِ */
    public static String m6364(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            bufferedInputStream.close();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static AbstractC4841 m6365(C3302 c3302, C2711 c2711) {
        List listUnmodifiableList;
        C1115 c1115 = (C1115) c2711.f8982;
        synchronized (c1115) {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(c1115.f3914));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            AbstractC3146 abstractC3146 = (AbstractC3146) listUnmodifiableList.get(i);
            abstractC3146.getClass();
            C5759 c5759 = new C5759();
            C0905 c0905 = (C0905) abstractC3146;
            String str = c0905.f3250;
            if (str == null) {
                C0178.m387("Null variantId");
                return null;
            }
            String str2 = c0905.f3252;
            if (str2 == null) {
                C0178.m387("Null rolloutId");
                return null;
            }
            c5759.f18981 = new C1403(str2, str);
            String str3 = c0905.f3249;
            if (str3 == null) {
                C0178.m387("Null parameterKey");
                return null;
            }
            c5759.f18980 = str3;
            c5759.f18978 = c0905.f3253;
            c5759.f18982 = c0905.f3251;
            c5759.f18979 = (byte) (c5759.f18979 | 1);
            arrayList.add(c5759.m9575());
        }
        if (arrayList.isEmpty()) {
            return c3302;
        }
        C4725 c4725M6061 = c3302.m6061();
        c4725M6061.f15598 = new C1094(arrayList);
        return c4725M6061.m8054();
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static C3571 m6366(Context context, C0578 c0578, C2711 c2711, C5534 c5534, C5002 c5002, C2711 c2712, C3369 c3369, C5534 c5535, C3369 c33610, C2702 c2702, C2808 c2808) {
        C0687 c0687 = new C0687(context, c0578, c5534, c3369, c5535);
        C1372 c1372 = new C1372(c2711, c5535, c2702);
        C3404 c3404 = C4592.f15153;
        C4046.m7244(context);
        return new C3571(c0687, c1372, new C4592(new C3943(C4046.m7245().m7246(new C3518(C4592.f15151, C4592.f15154)).m9573("FIREBASE_CRASHLYTICS_REPORT", new C1329("json"), C4592.f15152), c5535.m9209(), c33610)), c5002, c2712, c0578, c2808);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static List m6367(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                C0178.m387("Null key");
                return null;
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                C0178.m387("Null value");
                return null;
            }
            arrayList.add(new C0368(str, str2));
        }
        Collections.sort(arrayList, new C1068(9));
        return Collections.unmodifiableList(arrayList);
    }

    @Override // p000.InterfaceC4895
    public Object get() {
        Context context = (Context) ((InterfaceC4895) this.f11831).get();
        C0567 c0567 = (C0567) ((InterfaceC4895) this.f11830).get();
        C1835 c1835 = (C1835) ((InterfaceC4895) this.f11826).get();
        C2808 c2808 = (C2808) ((C2808) this.f11827).get();
        Executor executor = (Executor) ((InterfaceC4895) this.f11825).get();
        C1835 c1836 = (C1835) ((InterfaceC4895) this.f11828).get();
        C4575 c4575 = new C4575(4);
        C4369 c4369 = new C4369(3);
        C1835 c1837 = (C1835) ((InterfaceC4895) this.f11829).get();
        C0474 c0474 = new C0474();
        c0474.f1727 = context;
        c0474.f1725 = c0567;
        c0474.f1722 = c1835;
        c0474.f1728 = c2808;
        c0474.f1723 = executor;
        c0474.f1724 = c1836;
        c0474.f1730 = c4575;
        c0474.f1726 = c4369;
        c0474.f1729 = c1837;
        return c0474;
    }

    /* JADX INFO: renamed from: ۥَ */
    public C3580 m6368(String str, Executor executor) {
        C2332 c2332;
        ArrayList<File> arrayListM2905 = ((C1372) this.f11830).m2905();
        ArrayList<C3384> arrayList = new ArrayList();
        for (File file : arrayListM2905) {
            try {
                C3404 c3404 = C1372.f4697;
                String strM2902 = C1372.m2902(file);
                c3404.getClass();
                arrayList.add(new C3384(C3404.m6165(strM2902), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C3384 c3384 : arrayList) {
            if (str == null || str.equals(c3384.f11281)) {
                C4592 c4592 = (C4592) this.f11826;
                C2822 c2822 = c3384.f11282;
                if (c2822.f9427 == null || c2822.f9436 == null) {
                    C2721 c2721M1285 = ((C0578) this.f11828).m1285(true);
                    C2822 c2823 = c3384.f11282;
                    String str2 = c2721M1285.f9015;
                    C0541 c0541M5389 = c2823.m5389();
                    c0541M5389.f1944 = str2;
                    C2822 c2822M1237 = c0541M5389.m1237();
                    String str3 = c2721M1285.f9014;
                    C0541 c0541M53810 = c2822M1237.m5389();
                    c0541M53810.f1945 = str3;
                    c3384 = new C3384(c0541M53810.m1237(), c3384.f11281, c3384.f11280);
                }
                int i = 0;
                boolean z = str != null;
                C3943 c3943 = c4592.f15155;
                synchronized (c3943.f13159) {
                    try {
                        c2332 = new C2332();
                        if (z) {
                            ((AtomicInteger) c3943.f13165.f11255).getAndIncrement();
                            if (c3943.f13159.size() < c3943.f13158) {
                                C1397 c1397 = C1397.f4781;
                                c1397.m2965("Enqueueing report: " + c3384.f11281);
                                c1397.m2965("Queue size: " + c3943.f13159.size());
                                c3943.f13167.execute(new RunnableC0624(c3943, c3384, c2332, i));
                                c1397.m2965("Closing task for report: " + c3384.f11281);
                                c2332.m4374(c3384);
                            } else {
                                c3943.m7105();
                                String str4 = "Dropping report due to queue being full: " + c3384.f11281;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) c3943.f13165.f11254).getAndIncrement();
                                c2332.m4374(c3384);
                            }
                        } else {
                            c3943.m7104(c3384, c2332);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList2.add(c2332.f7721.m6386(executor, new C0178(this)));
            }
        }
        return AbstractC5378.m9074(arrayList2);
    }

    @Override // p000.InterfaceC4844
    /* JADX INFO: renamed from: ۥُ */
    public C1510 mo5366(C1166 c1166) {
        InterfaceC2090 interfaceC2090Mo5367 = mo5367(c1166);
        if (interfaceC2090Mo5367 == null) {
            return new C1510(C1510.f5125, C1510.f5126);
        }
        return interfaceC2090Mo5367 instanceof C1510 ? (C1510) interfaceC2090Mo5367 : new C1510(null, interfaceC2090Mo5367);
    }

    @Override // p000.InterfaceC4844
    /* JADX INFO: renamed from: ۥّ */
    public synchronized InterfaceC2090 mo5367(C1166 c1166) {
        AbstractC1631.m3435(c1166, "Null interface requested.");
        return (InterfaceC2090) ((HashMap) this.f11830).get(c1166);
    }

    /* JADX INFO: renamed from: ۥْ */
    public ArrayList m6369(ArrayList arrayList) {
        HashMap map = (HashMap) this.f11830;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5221 c5221 = (C5221) it.next();
            if (c5221.f17237 == 0) {
                InterfaceC2090 interfaceC2090 = (InterfaceC2090) ((HashMap) this.f11831).get(c5221);
                for (C1166 c1166 : c5221.f17239) {
                    if (map.containsKey(c1166)) {
                        arrayList2.add(new RunnableC5689(4, (C1510) ((InterfaceC2090) map.get(c1166)), interfaceC2090));
                    } else {
                        map.put(c1166, interfaceC2090);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public ArrayList m6370() {
        HashMap map = (HashMap) this.f11826;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.f11831).entrySet()) {
            C5221 c5221 = (C5221) entry.getKey();
            if (c5221.f17237 != 0) {
                InterfaceC2090 interfaceC2090 = (InterfaceC2090) entry.getValue();
                for (C1166 c1166 : c5221.f17239) {
                    if (!map2.containsKey(c1166)) {
                        map2.put(c1166, new HashSet());
                    }
                    ((Set) map2.get(c1166)).add(interfaceC2090);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                C0413 c0413 = (C0413) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC5689(5, c0413, (InterfaceC2090) it.next()));
                }
            } else {
                C1166 c1167 = (C1166) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                C0413 c0414 = new C0413();
                c0414.f1501 = null;
                c0414.f1502 = Collections.newSetFromMap(new ConcurrentHashMap());
                c0414.f1502.addAll(set);
                map.put(c1167, c0414);
            }
        }
        return arrayList;
    }

    @Override // p000.InterfaceC4844
    /* JADX INFO: renamed from: ۥۗ */
    public synchronized InterfaceC2090 mo5370(C1166 c1166) {
        C0413 c0413 = (C0413) ((HashMap) this.f11826).get(c1166);
        if (c0413 != null) {
            return c0413;
        }
        return f11824;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public void m6371(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C5221 c5221 = (C5221) entry.getKey();
            InterfaceC2090 interfaceC2090 = (InterfaceC2090) entry.getValue();
            int i = c5221.f17241;
            if (i == 1 || (i == 2 && z)) {
                interfaceC2090.get();
            }
        }
        C4048 c4048 = (C4048) this.f11825;
        synchronized (c4048) {
            try {
                arrayDeque = c4048.f13493;
                if (arrayDeque != null) {
                    c4048.f13493 = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw AbstractC5078.m8675(it);
            }
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public ApplicationExitInfo m6372(String str, List list, Predicate predicate) {
        long jLastModified = ((C1372) this.f11830).f4699.m5036(str, "start-time").lastModified();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoM2886 = AbstractC1369.m2886(it.next());
            if (applicationExitInfoM2886.getTimestamp() >= jLastModified && predicate.test(applicationExitInfoM2886)) {
                return applicationExitInfoM2886;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public void m6373() {
        HashMap map = (HashMap) this.f11830;
        HashMap map2 = (HashMap) this.f11826;
        for (C5221 c5221 : ((HashMap) this.f11831).keySet()) {
            for (C0332 c0332 : c5221.f17236) {
                boolean z = c0332.f1241 == 2;
                C1166 c1166 = c0332.f1242;
                if (z && !map2.containsKey(c1166)) {
                    Set set = Collections.EMPTY_SET;
                    C0413 c0413 = new C0413();
                    c0413.f1501 = null;
                    c0413.f1502 = Collections.newSetFromMap(new ConcurrentHashMap());
                    c0413.f1502.addAll(set);
                    map2.put(c1166, c0413);
                } else if (map.containsKey(c1166)) {
                    continue;
                } else {
                    int i = c0332.f1241;
                    if (i == 1) {
                        throw new C2690(1, "Unsatisfied dependency for component " + c5221 + ": " + c1166);
                    }
                    if (i != 2) {
                        map.put(c1166, new C1510(C1510.f5125, C1510.f5126));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public void m6374(Throwable th, Thread thread, String str, final C1097 c1097, boolean z) {
        final boolean zEquals = str.equals("crash");
        C0687 c0687 = (C0687) this.f11831;
        long j = c1097.f3867;
        Context context = c0687.f2504;
        int i = context.getResources().getConfiguration().orientation;
        C3369 c3369 = c0687.f2505;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        C1489 c1489 = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            c1489 = new C1489(th2.getLocalizedMessage(), th2.getClass().getName(), c3369.mo1576(th2.getStackTrace()), c1489, 16);
        }
        C1489 c14810 = c1489;
        C4725 c4725 = new C4725();
        c4725.f15599 = str;
        c4725.f15600 = j;
        c4725.f15602 = (byte) (c4725.f15602 | 1);
        AbstractC1355 abstractC1355M2962 = C1397.f4794.m2962(context);
        int i2 = ((C5498) abstractC1355M2962).f18156;
        Boolean boolValueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList arrayListM2957 = C1397.m2957(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c14810.f5058;
        String name = thread.getName();
        if (name == null) {
            C0178.m387("Null name");
            return;
        }
        List listM1538 = C0687.m1538(stackTraceElementArr, 4);
        if (listM1538 == null) {
            C0178.m387("Null frames");
            return;
        }
        arrayList.add(new C0524(4, name, listM1538));
        if (z) {
            for (Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                Thread key = next.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] stackTraceElementArrMo1576 = c3369.mo1576(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        C0178.m387("Null name");
                        return;
                    }
                    List listM1539 = C0687.m1538(stackTraceElementArrMo1576, 0);
                    if (listM1539 == null) {
                        C0178.m387("Null frames");
                        return;
                    }
                    arrayList.add(new C0524(0, name2, listM1539));
                }
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        C4257 c4257M1536 = C0687.m1536(c14810, 0);
        C1668 c1668M1537 = C0687.m1537();
        List listM1540 = c0687.m1540();
        if (listM1540 == null) {
            C0178.m387("Null binaries");
            return;
        }
        c4725.f15596 = new C2701(new C3123(listUnmodifiableList, c4257M1536, null, null, c1668M1537, listM1540), null, null, boolValueOf, abstractC1355M2962, arrayListM2957, i);
        c4725.f15601 = c0687.m1539(i);
        C3302 c3302M8054 = c4725.m8054();
        Map map = c1097.f3866;
        C5002 c5002 = (C5002) this.f11827;
        C2711 c2711 = (C2711) this.f11825;
        final AbstractC4841 abstractC4841M6365 = m6365(m6363(c3302M8054, c5002, c2711, map), c2711);
        if (z) {
            ((C1372) this.f11830).m2906(abstractC4841M6365, c1097.f3868, zEquals);
        } else {
            ((ExecutorC2291) ((C2808) this.f11829).f9376).m4346(new Runnable() { // from class: ۦُِؖٛ
                @Override // java.lang.Runnable
                public final void run() {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                    }
                    ((C1372) this.f13050.f11830).m2906(abstractC4841M6365, c1097.f3868, zEquals);
                }
            });
        }
    }
}
