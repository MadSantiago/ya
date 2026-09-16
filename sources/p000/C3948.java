package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۦِٜؒؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3948 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥؓ */
    public static final C3948 f13183;

    /* JADX INFO: renamed from: ۥؖ */
    public static final C3948 f13184;

    /* JADX INFO: renamed from: ۥً */
    public static final C3948 f13185;

    /* JADX INFO: renamed from: ۥَ */
    public static final C3948 f13186;

    /* JADX INFO: renamed from: ۥْ */
    public static final C3948 f13187;

    /* JADX INFO: renamed from: ۥٓ */
    public static final C3948 f13188;

    /* JADX INFO: renamed from: ۥٕ */
    public static final C3948 f13189;

    /* JADX INFO: renamed from: ۥٖ */
    public static final C3948 f13190;

    /* JADX INFO: renamed from: ۥٙ */
    public static final C3948 f13191;

    /* JADX INFO: renamed from: ۥۖ */
    public static final C3948 f13192;

    /* JADX INFO: renamed from: ۥۙ */
    public static final C3948 f13193;

    /* JADX INFO: renamed from: ۥۦ */
    public static final C3948 f13194;

    /* JADX INFO: renamed from: ۥۧ */
    public static final C3948 f13195;

    /* JADX INFO: renamed from: ۦؖ */
    public static final C3948 f13196;

    /* JADX INFO: renamed from: ۦؗ */
    public static final C3948 f13197;

    /* JADX INFO: renamed from: ۦؙ */
    public static final C3948 f13198;

    /* JADX INFO: renamed from: ۦُ */
    public static final C3948 f13199;

    /* JADX INFO: renamed from: ۦٕ */
    public static final C3948 f13200;

    /* JADX INFO: renamed from: ۦٗ */
    public static final C3948 f13201;

    /* JADX INFO: renamed from: ۦٚ */
    public static final C3948 f13202;

    /* JADX INFO: renamed from: ۦۛ */
    public static final C3948 f13203;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f13204;

    static {
        int i = 1;
        f13187 = new C3948(i, 0);
        f13188 = new C3948(i, 1);
        f13186 = new C3948(i, 2);
        f13190 = new C3948(i, 3);
        f13201 = new C3948(i, 4);
        f13203 = new C3948(i, 5);
        f13192 = new C3948(i, 6);
        f13200 = new C3948(i, 7);
        f13191 = new C3948(i, 8);
        f13184 = new C3948(i, 9);
        f13183 = new C3948(i, 10);
        f13195 = new C3948(i, 11);
        f13185 = new C3948(i, 12);
        f13202 = new C3948(i, 13);
        f13189 = new C3948(i, 14);
        f13193 = new C3948(i, 15);
        f13198 = new C3948(i, 16);
        f13196 = new C3948(i, 17);
        f13194 = new C3948(i, 18);
        f13197 = new C3948(i, 19);
        f13199 = new C3948(i, 20);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3948(C5450 c5450) {
        super(1);
        this.f13204 = 21;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01ae A[LOOP:1: B:95:0x0178->B:105:0x01ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x01b1 A[SYNTHETIC] */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) throws Throwable {
        String strValueOf;
        int i = this.f13204;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                C5006 c5006 = (C5006) obj;
                if (c5006.mo1315()) {
                    AbstractC3625 abstractC3625 = c5006.f16572;
                    if (!abstractC3625.f12092) {
                        InterfaceC4745 interfaceC4745Mo2711 = c5006.f16573.mo2711();
                        C3262 c3262 = abstractC3625.f12094;
                        if (interfaceC4745Mo2711 != null) {
                            abstractC3625.m6455(c5006, 9223372034707292159L, 0L);
                            abstractC3625.f12096 = interfaceC4745Mo2711;
                        } else if (c3262 != null) {
                            Object[] objArr = c3262.f10944;
                            long[] jArr = c3262.f10948;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i2 = 0;
                                while (true) {
                                    long j = jArr[i2];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                                        for (int i4 = 0; i4 < i3; i4++) {
                                            if ((255 & j) < 128) {
                                                abstractC3625.m6457((C3639) objArr[(i2 << 3) + i4]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i3 == 8) {
                                            if (i2 != length) {
                                                i2++;
                                            }
                                        }
                                    } else if (i2 != length) {
                                        i2++;
                                    }
                                }
                            }
                            c3262.m6020();
                        }
                    }
                }
                return c2358;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int i5 = 0;
                    for (byte b : (byte[]) value) {
                        i5++;
                        if (i5 > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b));
                    }
                    sb.append((CharSequence) "]");
                    strValueOf = sb.toString();
                } else {
                    strValueOf = String.valueOf(entry.getValue());
                }
                return AbstractC3761.m6622(new StringBuilder("  "), ((C3637) entry.getKey()).f12167, " = ", strValueOf);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC4384 interfaceC4384 = ((AbstractC1311) obj).f4522;
                if (interfaceC4384 != null) {
                    ((C0281) interfaceC4384).m584();
                }
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC1311 abstractC1311 = (AbstractC1311) obj;
                C0605 c0605 = abstractC1311.f4513;
                try {
                    if (abstractC1311.mo1315()) {
                        abstractC1311.m9795(true);
                        break;
                    }
                    return c2358;
                } catch (Throwable th) {
                    c0605.m1367(th);
                    throw null;
                }
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C4178 c4178 = (C4178) obj;
                if (c4178.mo1315()) {
                    c4178.f13910.mo772();
                }
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C0605 c0606 = (C0605) obj;
                if (c0606.m1348()) {
                    c0606.m1336(false);
                }
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C0605 c0607 = (C0605) obj;
                if (c0607.m1348()) {
                    c0607.m1336(false);
                }
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C0605 c0608 = (C0605) obj;
                if (c0608.m1348()) {
                    c0608.m1346(false);
                }
                return c2358;
            case 8:
                C0605 c0609 = (C0605) obj;
                if (c0609.m1348()) {
                    c0609.m1346(false);
                }
                return c2358;
            case 9:
                C0605 c06010 = (C0605) obj;
                if (c06010.m1348()) {
                    C0605.m1313(c06010, false, 7);
                }
                return c2358;
            case 10:
                C0605 c06011 = (C0605) obj;
                if (c06011.m1348()) {
                    C0605.m1312(c06011, false, 7);
                }
                return c2358;
            case 11:
                C0605 c06012 = (C0605) obj;
                if (c06012.m1348()) {
                    c06012.m1334();
                }
                return c2358;
            case 12:
                return c2358;
            case 13:
                C2453 c2453 = (C2453) obj;
                if (c2453.isAttachedToWindow()) {
                    c2453.m4578();
                }
                return c2358;
            case 14:
                return c2358;
            case 15:
                return Integer.valueOf(((C4344) obj).f14333);
            case 16:
                C4730 c4730 = ((C4344) obj).f14332;
                return Integer.valueOf(c4730.f15613 - c4730.f15611);
            case 17:
                return c2358;
            case 18:
                int i6 = ((C0221) obj).f824;
                return c2358;
            case 19:
                return c2358;
            case 20:
                int i7 = ((C0221) obj).f824;
                return c2358;
            default:
                ((AbstractC1849) obj).getClass();
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3948(int i, int i2) {
        super(i);
        this.f13204 = i2;
    }
}
