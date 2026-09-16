package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۥٍؘٛ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1797 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5995;

    public /* synthetic */ C1797(WorkDatabase workDatabase) {
        this.f5995 = 27;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01e0  */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        String str;
        int i = this.f5995;
        int i2 = 4;
        List list = C2340.f7777;
        int i3 = 0;
        int i4 = 3;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                ((C3751) obj).m6592(null);
                return c2358;
            case 1:
                ((C3751) obj).m6592(list);
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C0954 c0954 = (C0954) obj;
                c0954.getClass();
                C0322 c0322 = new C0322(i3, i4, c0954);
                List list2 = (List) c0322.m695();
                if (list2 != null) {
                    list = list2;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!AbstractC3831.m6874(((Enum) obj2).name(), new C4441(new long[]{7334417988463437039L, 2804432949181927828L, -8825589000201618859L}).toString())) {
                        arrayList.add(obj2);
                    }
                }
                c0322.m684(arrayList);
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((C3751) obj).m6592(list);
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C5310 c5310 = new C5310();
                C5310.m8924(c5310, new C4441(new long[]{-6732024012722621266L, -7808752818858736157L, 2251782359919981384L, -6383422725721876783L, -9092830822373409920L, -8882392393439006730L, 1283004726509233263L}).toString());
                ((C0637) obj).m1443(c5310);
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((C3751) obj).m6592(null);
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C0637.m1442((C0637) obj, new C4441(new long[]{3063163789377249988L, -6475731256702321648L}).toString());
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ((C3751) obj).m6595();
                return c2358;
            case 8:
                ((C3751) obj).m6592(null);
                return c2358;
            case 9:
                C2103 c2103 = (C2103) obj;
                int i5 = AbstractC4003.f13345;
                C4216 c4216 = AbstractC4354.f14355;
                c2103.getClass();
                Context context = (Context) C3133.m5778(c2103, c4216);
                InterfaceC2880 interfaceC2880 = (InterfaceC2880) C3133.m5778(c2103, AbstractC2853.f9544);
                C0593 c0593 = (C0593) C3133.m5778(c2103, AbstractC2507.f8328);
                if (c0593 == null) {
                    return null;
                }
                return new C3376(context, interfaceC2880, c0593.f2200, c0593.f2199);
            case 10:
                return c2358;
            case 11:
                ((C3751) obj).m6595();
                return c2358;
            case 12:
                ((C3751) obj).m6594();
                return c2358;
            case 13:
                ((C3751) obj).m6592(null);
                return c2358;
            case 14:
                ((C3751) obj).m6592(null);
                return c2358;
            case 15:
                ((C3751) obj).m6592(null);
                return c2358;
            case 16:
                Context context2 = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context2.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList2 = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                while (i3 < size) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i3);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context2.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList2.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context2.checkSelfPermission(str) == 0)) {
                            arrayList2.add(resolveInfo);
                        }
                    }
                    i3++;
                }
                return arrayList2;
            case 17:
                ((C3751) obj).m6591(new C1797(18));
                return c2358;
            case 18:
                C0954 c0955 = (C0954) obj;
                c0955.getClass();
                new C0322(i2, i4, c0955).m683();
                return c2358;
            case 19:
                C0954 c0956 = (C0954) obj;
                Object objM1970 = c0956.m1970();
                List list3 = (List) (objM1970 instanceof List ? objM1970 : null);
                if (list3 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list3) {
                        if (!AbstractC0684.m1527(obj3.toString(), new C4441(new long[]{8537420652623118766L, -6695836542289343253L}).toString(), false)) {
                            arrayList3.add(obj3);
                        }
                    }
                    c0956.m1973(arrayList3);
                }
                return c2358;
            case 20:
                ((C3751) obj).m6595();
                return c2358;
            case 21:
                C0637 c0637 = (C0637) obj;
                C5310 c5311 = new C5310();
                C5310.m8924(c5311, new C4441(new long[]{-6509406933156729233L, 4887752011045593803L, 8829808294318214968L, 7383150603832223140L, -522317149391827222L, -8387880332294344676L, 3180326725314732048L}).toString());
                c0637.m1443(c5311);
                C2470 c2470 = c0637.f2377;
                if (c2470 == null) {
                    c2470 = new C2470();
                    c0637.f2377 = c2470;
                }
                C0094 c0094 = new C0094();
                c0094.f17930 = 1;
                c0094.f17931 = Integer.MAX_VALUE;
                c2470.f8244 = c0094;
                return c2358;
            case 22:
                C5310 c5312 = new C5310();
                C5310.m8924(c5312, new C4441(new long[]{-6047350536304864876L, -3665277169226291321L, 821521680094840024L, 38052750992581647L, 5645624410967218946L, 468422703917961052L, 2700240090674509550L}).toString());
                ((C0637) obj).m1443(c5312);
                return c2358;
            case 23:
                ((C3751) obj).m6592(null);
                return c2358;
            case 24:
                C0954 c0957 = (C0954) obj;
                C4524.f14953.getClass();
                C1443 c1443M7845 = C4524.m7845();
                C1542 c1542 = AbstractC2539.f8446;
                Object obj4 = c1542.f5218;
                String str2 = c1542.f5219;
                boolean z = C1443.f4940;
                boolean zBooleanValue = ((Boolean) c1443M7845.m3068(obj4, str2)).booleanValue();
                C1443 c1443M7846 = C4524.m7845();
                C1542 c1543 = AbstractC2539.f8438;
                boolean zBooleanValue2 = ((Boolean) c1443M7846.m3068(c1543.f5218, c1543.f5219)).booleanValue();
                c0957.getClass();
                new C0322(23, i4, c0957).m683();
                if (zBooleanValue || zBooleanValue2) {
                    new C0322(11, i4, c0957).m694();
                    new C0322(13, i4, c0957).m683();
                }
                if (!zBooleanValue) {
                    new C0322(i4, i4, c0957).m694();
                }
                return c2358;
            case 25:
                C0637.m1440((C0637) obj, new C4441(new long[]{2489346159217188270L, 3961278502154987589L, -8451484621894064616L, 5865642941579959782L}).toString(), 3);
                return c2358;
            case 26:
                C4524.f14953.getClass();
                C1443 c1443M7847 = C4524.m7845();
                C1542 c1544 = AbstractC2539.f8461;
                Object obj5 = c1544.f5218;
                String str3 = c1544.f5219;
                boolean z2 = C1443.f4940;
                ((C3751) obj).m6592(Boolean.valueOf(((Set) c1443M7847.m3068(obj5, str3)).contains(EnumC2847.f9506.f9511)));
                return c2358;
            case 27:
                throw new C1345();
            case 28:
                ((C2518) obj).m4661(new C4441(new long[]{7174188833083642563L, 556905221213771310L}).toString(), AbstractC2539.f8442.f5219);
                return c2358;
            default:
                return new C5108((Map) obj);
        }
    }

    public /* synthetic */ C1797(int i) {
        this.f5995 = i;
    }
}
