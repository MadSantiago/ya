package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦؘّٝؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4769 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15722;

    public /* synthetic */ C4769(int i) {
        this.f15722 = i;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        EnumC1048 enumC1048;
        Object objM1236;
        switch (this.f15722) {
            case 0:
                C5647 c5647 = (C5647) obj2;
                return AbstractC2164.m4212(Float.valueOf(c5647.f18600), Float.valueOf(c5647.f18599));
            case 1:
                C5869 c5869 = (C5869) obj;
                C4755 c4755 = (C4755) obj2;
                C5023 c5023 = new C5023(c4755.f15696);
                C1654 c1654 = AbstractC0539.f1932;
                return AbstractC2164.m4212(AbstractC0539.m1236(c5023, c1654, c5869), AbstractC0539.m1236(new C5023(c4755.f15695), c1654, c5869));
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return Integer.valueOf(((C1626) obj2).f5444);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C0780 c0780 = (C0780) obj2;
                return AbstractC2164.m4212(c0780.f2822, AbstractC0539.m1236(c0780.f2821, AbstractC0539.f1928, (C5869) obj));
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return Float.valueOf(((C3917) obj2).f13058);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C5869 c58610 = (C5869) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(AbstractC0539.m1236((C2331) list.get(i), AbstractC0539.f1917, c58610));
                }
                return arrayList;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C3346 c3346 = (C3346) obj2;
                return AbstractC2164.m4212(Integer.valueOf((int) (c3346.f11197 >> 32)), Integer.valueOf((int) (c3346.f11197 & 4294967295L)));
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C5869 c58611 = (C5869) obj;
                C5906 c5906 = (C5906) obj2;
                return AbstractC2164.m4212(AbstractC0539.m1236(new C1327(c5906.f19489), AbstractC0539.f1933, c58611), AbstractC0539.m1236(new C1553(c5906.f19488), AbstractC0539.f1925, c58611), Float.valueOf(c5906.f19487));
            case 8:
                return Integer.valueOf(((C4202) obj2).f13960);
            case 9:
                return Integer.valueOf(((C4740) obj2).f15639);
            case 10:
                return Integer.valueOf(((C1723) obj2).f5745);
            case 11:
                return Integer.valueOf(((C5827) obj2).f19197);
            case 12:
                return Integer.valueOf(((C2848) obj2).f9512);
            case 13:
                C5023 c5024 = (C5023) obj2;
                return c5024 != null ? C5023.m8440(c5024.f16622, C5023.f16620) : false ? Boolean.FALSE : AbstractC2164.m4212(Float.valueOf(C5023.m8438(c5024.f16622)), AbstractC0539.m1236(new C3970(C5023.m8439(c5024.f16622)), AbstractC0539.f1916, (C5869) obj));
            case 14:
                C2458 c2458 = (C2458) obj2;
                return AbstractC2164.m4212(c2458.f8212, AbstractC0539.m1236(c2458.f8211, AbstractC0539.f1928, (C5869) obj));
            case 15:
                long j = ((C3970) obj2).f13273;
                if (C3970.m7128(j, 8589934592L)) {
                    return 0;
                }
                if (C3970.m7128(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 16:
                C1553 c1553 = (C1553) obj2;
                return c1553 != null ? C1553.m3306(c1553.f5241, 9205357640488583168L) : false ? Boolean.FALSE : AbstractC2164.m4212(Float.valueOf(Float.intBitsToFloat((int) (c1553.f5241 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (c1553.f5241 & 4294967295L))));
            case 17:
                C5869 c58612 = (C5869) obj;
                C2331 c2331 = (C2331) obj2;
                Object obj3 = c2331.f7719;
                if (obj3 instanceof C0477) {
                    enumC1048 = EnumC1048.f3714;
                } else if (obj3 instanceof C0553) {
                    enumC1048 = EnumC1048.f3713;
                } else if (obj3 instanceof C4433) {
                    enumC1048 = EnumC1048.f3708;
                } else if (obj3 instanceof C0894) {
                    enumC1048 = EnumC1048.f3709;
                } else if (obj3 instanceof C0780) {
                    enumC1048 = EnumC1048.f3707;
                } else if (obj3 instanceof C2458) {
                    enumC1048 = EnumC1048.f3710;
                } else {
                    if (!(obj3 instanceof C3435)) {
                        throw new UnsupportedOperationException();
                    }
                    enumC1048 = EnumC1048.f3711;
                }
                switch (enumC1048.ordinal()) {
                    case 0:
                        objM1236 = AbstractC0539.m1236((C0477) obj3, AbstractC0539.f1930, c58612);
                        break;
                    case 1:
                        objM1236 = AbstractC0539.m1236((C0553) obj3, AbstractC0539.f1918, c58612);
                        break;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        objM1236 = AbstractC0539.m1236((C4433) obj3, AbstractC0539.f1907, c58612);
                        break;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        objM1236 = AbstractC0539.m1236((C0894) obj3, AbstractC0539.f1921, c58612);
                        break;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        objM1236 = AbstractC0539.m1236((C0780) obj3, AbstractC0539.f1910, c58612);
                        break;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        objM1236 = AbstractC0539.m1236((C2458) obj3, AbstractC0539.f1911, c58612);
                        break;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        objM1236 = ((C3435) obj3).f11405;
                        break;
                    default:
                        C1078.m2275();
                        return null;
                }
                return AbstractC2164.m4212(enumC1048, objM1236, Integer.valueOf(c2331.f7718), Integer.valueOf(c2331.f7717), c2331.f7720);
            case 18:
                C5869 c58613 = (C5869) obj;
                List list2 = ((C5668) obj2).f18646;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(AbstractC0539.m1236((C0620) list2.get(i2), AbstractC0539.f1906, c58613));
                }
                return arrayList2;
            case 19:
                return ((C0620) obj2).f2309.toLanguageTag();
            case 20:
                C5869 c58614 = (C5869) obj;
                C1220 c1220 = (C1220) obj2;
                return AbstractC2164.m4212(AbstractC0539.m1236(new C5830(c1220.f4213), AbstractC0539.f1920, c58614), AbstractC0539.m1236(new C5317(c1220.f4212), AbstractC0539.f1908, c58614), AbstractC0539.m1236(new C1200(c1220.f4211), AbstractC0539.f1927, c58614));
            case 21:
                return Float.valueOf(((C5830) obj2).f19208);
            case 22:
                return Integer.valueOf(((C5317) obj2).f17504);
            case 23:
                return Integer.valueOf(((C1200) obj2).f4135);
            case 24:
                return ((C4433) obj2).f14614;
            case 25:
                C5869 c58615 = (C5869) obj;
                C0477 c0477 = (C0477) obj2;
                Object objM1237 = AbstractC0539.m1236(new C4202(c0477.f1736), AbstractC0539.f1912, c58615);
                Object objM1238 = AbstractC0539.m1236(new C4740(c0477.f1734), AbstractC0539.f1913, c58615);
                Object objM1239 = AbstractC0539.m1236(new C5023(c0477.f1731), AbstractC0539.f1932, c58615);
                C4755 c4756 = c0477.f1737;
                C4755 c4757 = C4755.f15694;
                Object objM12310 = AbstractC0539.m1236(c4756, AbstractC0539.f1922, c58615);
                Object objM12311 = AbstractC0539.m1236(c0477.f1732, AbstractC4489.f14844, c58615);
                C1220 c1221 = c0477.f1733;
                C1220 c1222 = C1220.f4210;
                return AbstractC2164.m4212(objM1237, objM1238, objM1239, objM12310, objM12311, AbstractC0539.m1236(c1221, AbstractC0539.f1905, c58615), AbstractC0539.m1236(new C2591(c0477.f1739), AbstractC4489.f14846, c58615), AbstractC0539.m1236(new C1723(c0477.f1735), AbstractC0539.f1909, c58615), AbstractC0539.m1236(c0477.f1738, AbstractC4489.f14862, c58615));
            case 26:
                return ((C0894) obj2).f3238;
            case 27:
                C5869 c58616 = (C5869) obj;
                C0553 c0553 = (C0553) obj2;
                C1327 c1327 = new C1327(c0553.f1989.mo3548());
                C1654 c1655 = AbstractC0539.f1933;
                Object objM12312 = AbstractC0539.m1236(c1327, c1655, c58616);
                C5023 c5025 = new C5023(c0553.f1987);
                C1654 c1656 = AbstractC0539.f1932;
                Object objM12313 = AbstractC0539.m1236(c5025, c1656, c58616);
                C1626 c1626 = c0553.f1984;
                C1626 c1627 = C1626.f5443;
                Object objM12314 = AbstractC0539.m1236(c1626, AbstractC0539.f1923, c58616);
                Object objM12315 = AbstractC0539.m1236(c0553.f1990, AbstractC0539.f1914, c58616);
                Object objM12316 = AbstractC0539.m1236(c0553.f1985, AbstractC0539.f1926, c58616);
                String str = c0553.f1996;
                Object objM12317 = AbstractC0539.m1236(new C5023(c0553.f1988), c1656, c58616);
                Object objM12318 = AbstractC0539.m1236(c0553.f1994, AbstractC0539.f1931, c58616);
                Object objM12319 = AbstractC0539.m1236(c0553.f1993, AbstractC0539.f1929, c58616);
                C5668 c5668 = c0553.f1995;
                C5668 c5669 = C5668.f18644;
                Object objM12320 = AbstractC0539.m1236(c5668, AbstractC0539.f1915, c58616);
                Object objM12321 = AbstractC0539.m1236(new C1327(c0553.f1991), c1655, c58616);
                Object objM12322 = AbstractC0539.m1236(c0553.f1992, AbstractC0539.f1924, c58616);
                C5906 c5907 = c0553.f1997;
                C5906 c5908 = C5906.f19486;
                return AbstractC2164.m4212(objM12312, objM12313, objM12314, objM12315, objM12316, -1, str, objM12317, objM12318, objM12319, objM12320, objM12321, objM12322, AbstractC0539.m1236(c5907, AbstractC0539.f1934, c58616));
            case 28:
                C5869 c58617 = (C5869) obj;
                C0917 c0917 = (C0917) obj2;
                C0553 c0554 = c0917.f3290;
                C2346 c2346 = AbstractC0539.f1918;
                return AbstractC2164.m4212(AbstractC0539.m1236(c0554, c2346, c58617), AbstractC0539.m1236(c0917.f3289, c2346, c58617), AbstractC0539.m1236(c0917.f3288, c2346, c58617), AbstractC0539.m1236(c0917.f3291, c2346, c58617));
            default:
                C0823 c0823 = (C0823) obj2;
                Boolean boolValueOf = Boolean.valueOf(c0823.f2920);
                C2346 c2347 = AbstractC0539.f1919;
                return AbstractC2164.m4212(boolValueOf, AbstractC0539.m1236(new C1857(c0823.f2919), AbstractC4489.f14856, (C5869) obj));
        }
    }
}
