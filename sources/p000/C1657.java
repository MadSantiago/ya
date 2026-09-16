package p000;

import java.text.BreakIterator;
import java.util.List;

/* JADX INFO: renamed from: ۥْٙؔٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1657 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5510;

    public /* synthetic */ C1657(int i) {
        this.f5510 = i;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        C0917 c0917Mo1682;
        C0553 c0553;
        int i = this.f5510;
        int i2 = 8;
        Class<Integer> cls = Integer.class;
        int i3 = 3;
        int i4 = 1;
        int i5 = 0;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                ((Float) obj).getClass();
                return c2358;
            case 1:
                ((C3751) obj).m6594();
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C3098 c3098 = (C3098) obj;
                Class<Integer> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(cls));
                c3098.m5686(clsM9037 != null ? clsM9037 : Integer.class);
                c3098.f10386 = new C0094(8, 1);
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((C0637) obj).m1449(new C1657(4));
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C0637 c0637 = (C0637) obj;
                String string = new C4441(new long[]{3310777308373268619L, -3138556930229700382L, -3596095823294517315L}).toString();
                c0637.getClass();
                C0637.m1442(c0637, string);
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C0637.m1440((C0637) obj, new C4441(new long[]{677292704190186511L, -2970942313282965477L}).toString(), 1);
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                ((C3751) obj).m6591(new C1657(i2));
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C2470 c2470 = (C2470) obj;
                c2470.m4632(null);
                Class<Integer> clsM9038 = AbstractC5378.m9037(AbstractC5041.m8557(cls));
                c2470.m4633(clsM9038 != null ? clsM9038 : Integer.class);
                C2470.m4631(c2470, new C4441(new long[]{-2693957278772455879L, 5820407547995650729L, 2147674901316055650L}).toString());
                c2470.m4632(null);
                c2470.m4632(null);
                Class<Boolean> clsM9039 = AbstractC5378.m9037(AbstractC5041.m8557(Boolean.class));
                c2470.m4633(clsM9039 != null ? clsM9039 : Boolean.class);
                return c2358;
            case 8:
                C0954 c0954 = (C0954) obj;
                c0954.getClass();
                new C0322(c0954.m1971().length - 1, i3, c0954).m683();
                return c2358;
            case 9:
                ((C3751) obj).m6591(new C1657(10));
                return c2358;
            case 10:
                C0954 c0955 = (C0954) obj;
                c0955.getClass();
                new C0322(i4, i3, c0955).m683();
                return c2358;
            case 11:
                ((C3751) obj).m6591(new C1657(12));
                return c2358;
            case 12:
                C0954 c0956 = (C0954) obj;
                c0956.getClass();
                new C0322(i4, i3, c0956).m683();
                return c2358;
            case 13:
                ((C3751) obj).m6591(new C1657(14));
                return c2358;
            case 14:
                C0954 c0957 = (C0954) obj;
                c0957.getClass();
                new C0322(i5, i3, c0957).m694();
                return c2358;
            case 15:
                C1667 c1667 = (C1667) obj;
                String str = c1667.f5559.f4307;
                long j = c1667.f5553;
                int i6 = C3346.f11195;
                int i7 = (int) (j & 4294967295L);
                int iOffsetByCodePoints = (i7 > 0 && i7 > 0) ? Character.offsetByCodePoints(str, i7, -1) : -1;
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new C0351(((int) (c1667.f5553 & 4294967295L)) - iOffsetByCodePoints, 0);
            case 16:
                C1667 c1668 = (C1667) obj;
                String str2 = c1668.f5559.f4307;
                long j2 = c1668.f5553;
                int i8 = C3346.f11195;
                int i9 = (int) (j2 & 4294967295L);
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str2);
                int iFollowing = characterInstance.following(i9);
                if (iFollowing != -1) {
                    return new C0351(0, iFollowing - ((int) (c1668.f5553 & 4294967295L)));
                }
                return null;
            case 17:
                C1667 c1669 = (C1667) obj;
                Integer numM3484 = c1669.m3484();
                if (numM3484 == null) {
                    return null;
                }
                int iIntValue = numM3484.intValue();
                long j3 = c1669.f5553;
                int i10 = C3346.f11195;
                return new C0351(((int) (j3 & 4294967295L)) - iIntValue, 0);
            case 18:
                C1667 c16610 = (C1667) obj;
                Integer numM3491 = c16610.m3491();
                if (numM3491 == null) {
                    return null;
                }
                int iIntValue2 = numM3491.intValue();
                long j4 = c16610.f5553;
                int i11 = C3346.f11195;
                return new C0351(0, iIntValue2 - ((int) (j4 & 4294967295L)));
            case 19:
                C1667 c16611 = (C1667) obj;
                Integer numM3483 = c16611.m3483();
                if (numM3483 == null) {
                    return null;
                }
                int iIntValue3 = numM3483.intValue();
                long j5 = c16611.f5553;
                int i12 = C3346.f11195;
                return new C0351(((int) (j5 & 4294967295L)) - iIntValue3, 0);
            case 20:
                C1667 c16612 = (C1667) obj;
                Integer numM3488 = c16612.m3488();
                if (numM3488 == null) {
                    return null;
                }
                int iIntValue4 = numM3488.intValue();
                long j6 = c16612.f5553;
                int i13 = C3346.f11195;
                return new C0351(0, iIntValue4 - ((int) (j6 & 4294967295L)));
            case 21:
                List list = (List) obj;
                return new C4950(((Boolean) list.get(1)).booleanValue() ? EnumC1616.f5425 : EnumC1616.f5424, ((Float) list.get(0)).floatValue());
            case 22:
                return c2358;
            case 23:
                return c2358;
            case 24:
                C2331 c2331 = (C2331) obj;
                Object obj2 = c2331.f7719;
                if (!(obj2 instanceof AbstractC4428) || (c0917Mo1682 = ((AbstractC4428) obj2).mo1682()) == null || (c0917Mo1682.f3290 == null && c0917Mo1682.f3289 == null && c0917Mo1682.f3288 == null && c0917Mo1682.f3291 == null)) {
                    return AbstractC2164.m4212(c2331);
                }
                C0917 c0917Mo1683 = ((AbstractC4428) c2331.f7719).mo1682();
                if (c0917Mo1683 == null || (c0553 = c0917Mo1683.f3290) == null) {
                    c0553 = new C0553(0L, 0L, (C1626) null, (C5827) null, (C2848) null, (AbstractC0903) null, (String) null, 0L, (C3917) null, (C5647) null, (C5668) null, 0L, (C1690) null, (C5906) null, 65535);
                }
                return AbstractC2164.m4212(c2331, new C2331(c2331.f7718, c2331.f7717, c0553));
            case 25:
                ((InterfaceC1066) obj).mo2266(AbstractC2771.f9215, c2358);
                return c2358;
            case 26:
                List list2 = (List) obj;
                return new C5765(((Number) list2.get(0)).floatValue(), ((Number) list2.get(1)).floatValue(), ((Number) list2.get(2)).floatValue());
            case 27:
                return Boolean.valueOf(((InterfaceC0252) obj).mo533());
            case 28:
                ((C3751) obj).m6594();
                return c2358;
            default:
                InterfaceC0252 interfaceC0252 = (InterfaceC0252) obj;
                C0232 c0232 = new C0232();
                while (interfaceC0252.mo533()) {
                    c0232.add(Integer.valueOf((int) interfaceC0252.getLong(0)));
                }
                return C4773.m8152(c0232);
        }
    }
}
