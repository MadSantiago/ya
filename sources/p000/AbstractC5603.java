package p000;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: ۦۣؔۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5603 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final String f18455 = C1984.m3875("EnqueueRunnable");

    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    /* JADX INFO: renamed from: ۥۣ */
    public static boolean m9449(C1811 c1811) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        WorkDatabase workDatabase;
        boolean z5;
        boolean z6;
        boolean z7;
        HashSet hashSetM3591 = C1811.m3591(c1811);
        C3600 c3600 = c1811.f6034;
        List list = c1811.f6035;
        int i = 0;
        String[] strArr = (String[]) hashSetM3591.toArray(new String[0]);
        String str = c1811.f6032;
        int i2 = c1811.f6029;
        Object obj = c3600.f11989.f9390;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = c3600.f11986;
        boolean z8 = strArr != null && strArr.length > 0;
        EnumC4972 enumC4972 = EnumC4972.f16450;
        EnumC4972 enumC4973 = EnumC4972.f16452;
        EnumC4972 enumC4974 = EnumC4972.f16451;
        if (z8) {
            int length = strArr.length;
            z = false;
            z2 = false;
            z3 = true;
            while (true) {
                if (i < length) {
                    String str2 = strArr[i];
                    List list2 = list;
                    C4142 c4142M378 = workDatabase2.mo103().m378(str2);
                    if (c4142M378 == null) {
                        C1984.m3874().m3884(f18455, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        EnumC4972 enumC4975 = c4142M378.f13785;
                        z3 &= enumC4975 == enumC4972;
                        if (enumC4975 == enumC4974) {
                            z2 = true;
                        } else if (enumC4975 == enumC4973) {
                            z = true;
                        }
                        i++;
                        list = list2;
                    }
                }
                z7 = false;
                z6 = true;
                c1811.f6036 = z6;
                return z7;
            }
        }
        z = false;
        z2 = false;
        z3 = true;
        List list3 = list;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        EnumC4972 enumC4976 = EnumC4972.f16455;
        if (zIsEmpty || z8) {
            z4 = zIsEmpty;
            workDatabase = workDatabase2;
            z5 = false;
        } else {
            List listM375 = workDatabase2.mo103().m375(str);
            if (listM375.isEmpty()) {
                z4 = zIsEmpty;
                workDatabase = workDatabase2;
            } else {
                int i3 = 4;
                z4 = zIsEmpty;
                if (i2 == 3 || i2 == 4) {
                    C1894 c1894Mo86 = workDatabase2.mo86();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listM375.iterator();
                    while (it.hasNext()) {
                        C1883 c1883 = (C1883) it.next();
                        WorkDatabase workDatabase3 = workDatabase2;
                        C1894 c1894 = c1894Mo86;
                        Iterator it2 = it;
                        if (!((Boolean) AbstractC0487.m1075(c1894Mo86.f6278, true, false, new C3203(2, c1883.f6253))).booleanValue()) {
                            EnumC4972 enumC4977 = c1883.f6252;
                            boolean z9 = z3 & (enumC4977 == enumC4972);
                            if (enumC4977 == enumC4974) {
                                z2 = true;
                            } else if (enumC4977 == enumC4973) {
                                z = true;
                            }
                            arrayList.add(c1883.f6253);
                            z3 = z9;
                        }
                        workDatabase2 = workDatabase3;
                        c1894Mo86 = c1894;
                        it = it2;
                        i3 = 4;
                    }
                    workDatabase = workDatabase2;
                    List list4 = arrayList;
                    list4 = arrayList;
                    if (i2 == i3 && (z || z2)) {
                        C0177 c0177Mo103 = workDatabase.mo103();
                        Iterator it3 = c0177Mo103.m375(str).iterator();
                        while (it3.hasNext()) {
                            AbstractC0487.m1075(c0177Mo103.f663, false, true, new C3203(19, ((C1883) it3.next()).f6253));
                        }
                        z = false;
                        z2 = false;
                        list4 = Collections.EMPTY_LIST;
                    }
                    strArr = (String[]) list4.toArray(strArr);
                    z8 = strArr.length > 0;
                } else {
                    if (i2 == 2) {
                        Iterator it4 = listM375.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                EnumC4972 enumC4978 = ((C1883) it4.next()).f6252;
                                if (enumC4978 == enumC4976 || enumC4978 == EnumC4972.f16454) {
                                    z7 = false;
                                    z6 = true;
                                    c1811.f6036 = z6;
                                    return z7;
                                }
                            }
                        }
                    }
                    workDatabase2.m104(new RunnableC3599(workDatabase2, str, c3600, 1));
                    C0177 c0177Mo104 = workDatabase2.mo103();
                    Iterator it5 = listM375.iterator();
                    while (it5.hasNext()) {
                        AbstractC0487.m1075(c0177Mo104.f663, false, true, new C3203(19, ((C1883) it5.next()).f6253));
                    }
                    workDatabase = workDatabase2;
                    z5 = true;
                }
            }
            z5 = false;
        }
        Iterator it6 = list3.iterator();
        boolean z10 = z5;
        while (it6.hasNext()) {
            AbstractC3104 abstractC3104 = (AbstractC3104) it6.next();
            C4142 c4142 = abstractC3104.f10406;
            UUID uuid = abstractC3104.f10407;
            if (!z8 || z3) {
                c4142.f13797 = jCurrentTimeMillis;
            } else if (z2) {
                c4142.f13785 = enumC4974;
            } else if (z) {
                c4142.f13785 = enumC4973;
            } else {
                c4142.f13785 = EnumC4972.f16449;
            }
            if (c4142.f13785 == enumC4976) {
                z10 = true;
            }
            C0177 c0177Mo105 = workDatabase.mo103();
            C2775 c2775 = c4142.f13778;
            Iterator it7 = it6;
            boolean zM5209 = c2775.m5209("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
            EnumC4972 enumC4979 = enumC4976;
            boolean zM52010 = c2775.m5209("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
            boolean zM52011 = c2775.m5209("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
            if (!zM5209 && zM52010 && zM52011) {
                String str3 = c4142.f13776;
                C0697 c0697 = new C0697(0);
                c0697.m1549(c2775.f9250);
                LinkedHashMap linkedHashMap = c0697.f2527;
                linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str3);
                C2775 c2776 = new C2775(linkedHashMap);
                AbstractC0993.m2142(c2776);
                c4142 = new C4142(c4142.f13787, c4142.f13785, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", c4142.f13788, c2776, c4142.f13779, c4142.f13796, c4142.f13786, c4142.f13794, c4142.f13791, c4142.f13795, c4142.f13789, c4142.f13790, c4142.f13797, c4142.f13800, c4142.f13799, c4142.f13780, c4142.f13781, c4142.f13777, c4142.f13782, c4142.f13793, c4142.f13798, c4142.f13784, c4142.f13792, c4142.f13783);
            }
            AbstractC0487.m1075(c0177Mo105.f663, false, true, new C1708(24, c0177Mo105, c4142));
            if (z8) {
                for (String str4 : strArr) {
                    C0451 c0451 = new C0451(uuid.toString(), str4);
                    C1894 c1894Mo87 = workDatabase.mo86();
                    AbstractC0487.m1075(c1894Mo87.f6278, false, true, new C0079(13, c1894Mo87, c0451));
                }
            }
            C5301 c5301Mo90 = workDatabase.mo90();
            String string = uuid.toString();
            LinkedHashSet linkedHashSet = abstractC3104.f10405;
            c5301Mo90.getClass();
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                AbstractC0487.m1075(c5301Mo90.f17460, false, true, new C1708(25, c5301Mo90, new C0472((String) it8.next(), string)));
            }
            if (!z4) {
                C1076 c1076Mo89 = workDatabase.mo89();
                AbstractC0487.m1075(c1076Mo89.f3763, false, true, new C1708(21, c1076Mo89, new C3041(str, uuid.toString())));
            }
            it6 = it7;
            z10 = z10;
            enumC4976 = enumC4979;
            jCurrentTimeMillis = jCurrentTimeMillis;
        }
        z6 = true;
        z7 = z10;
        c1811.f6036 = z6;
        return z7;
    }
}
