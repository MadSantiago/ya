package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* JADX INFO: renamed from: ۦٝؖۦۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4762 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f15711;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f15712;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15713;

    public /* synthetic */ C4762(int i, int i2, Object obj, Object obj2) {
        this.f15713 = i2;
        this.f15712 = obj;
        this.f15711 = obj2;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) throws Throwable {
        int i;
        C5362 c5362;
        C3346 c3346;
        int i2 = this.f15713;
        C4036 c4036 = C2850.f9517;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f15711;
        Object obj4 = this.f15712;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC3801.m6770((List) obj4, (C1347) obj3, (C5362) obj, AbstractC3831.m6835(1));
                return c2358;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC3801.m6763((InterfaceC4745) obj4, (C0857) obj3, (C5362) obj, AbstractC3831.m6835(49));
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                AbstractC4009.m7165((InterfaceC0705) obj4, (InterfaceC4745) obj3, (C5362) obj, AbstractC3831.m6835(1));
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                ((C0767) obj4).m1659((C2450) obj3, (C5362) obj, AbstractC3831.m6835(1));
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                ((C0942) obj4).m1917((C1489) obj3, (C5362) obj, AbstractC3831.m6835(1));
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                ((C4691) obj4).m8040((C4741) obj3, (C5362) obj, AbstractC3831.m6835(1));
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC3320 interfaceC3320 = (InterfaceC3320) obj4;
                C0843 c0843 = (C0843) obj3;
                C5362 c5363 = (C5362) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c5363.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zM8963 = c5363.m8963(interfaceC3320);
                    Object objM8999 = c5363.m8999();
                    if (zM8963 || objM8999 == c4036) {
                        objM8999 = AbstractC3004.m5600(new C3548(0, interfaceC3320, InterfaceC3320.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 3));
                        c5363.m8987(objM8999);
                    }
                    AbstractC1211.m2581(c0843, (C1197) ((InterfaceC5372) objM8999).getValue(), c5363, 0);
                } else {
                    c5363.m8982();
                }
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                AbstractC1211.m2581((C0843) obj4, (C1197) obj3, (C5362) obj, AbstractC3831.m6835(1));
                return c2358;
            case 8:
                C0175 c0175 = (C0175) obj4;
                C0126 c0126 = (C0126) obj3;
                int iIntValue2 = ((Integer) obj).intValue();
                if (obj2 instanceof InterfaceC1263) {
                    ((C0863) c0175.f651).m1843((InterfaceC1263) obj2);
                } else if (!(obj2 instanceof C5656)) {
                    if (obj2 instanceof C1670) {
                        AbstractC4489.m7791(c0126, iIntValue2, obj2);
                        c0175.m369((C1670) obj2);
                    } else if (obj2 instanceof C5863) {
                        AbstractC4489.m7791(c0126, iIntValue2, obj2);
                        ((C5863) obj2).m9681();
                    }
                }
                return c2358;
            case 9:
                C0880 c0880 = (C0880) obj4;
                C4133 c4133 = (C4133) obj3;
                C5362 c5364 = (C5362) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c5364.m9011(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    InterfaceC4112 interfaceC4112 = (InterfaceC4112) c0880.f3215.mo449();
                    int iMo5819 = c4133.f13753;
                    Object obj5 = c4133.f13756;
                    if (iMo5819 >= interfaceC4112.mo5821() || !interfaceC4112.mo5820(iMo5819).equals(obj5)) {
                        iMo5819 = interfaceC4112.mo5819(obj5);
                        i = -1;
                        if (iMo5819 != -1) {
                            c4133.f13753 = iMo5819;
                        }
                    } else {
                        i = -1;
                    }
                    if (iMo5819 != i) {
                        c5364.m8957(-1664741271);
                        AbstractC2164.m4209(interfaceC4112, c0880.f3216, iMo5819, c4133.f13756, c5364, 0);
                        c5362 = c5364;
                        c5362.m9009(false);
                    } else {
                        c5362 = c5364;
                        c5362.m8957(-1664505826);
                        c5362.m9009(false);
                    }
                    boolean zM8977 = c5362.m8977(c4133);
                    Object objM89910 = c5362.m8999();
                    if (zM8977 || objM89910 == c4036) {
                        objM89910 = new C0091(13, c4133);
                        c5362.m8987(objM89910);
                    }
                    AbstractC3925.m7028(obj5, (InterfaceC4745) objM89910, c5362);
                } else {
                    c5364.m8982();
                }
                return c2358;
            case 10:
                return ((InterfaceC5572) obj3).mo3754(new C3504((C0880) obj4, (InterfaceC1422) obj), ((C3693) obj2).f12325);
            case 11:
                C0857 c0857 = (C0857) obj4;
                C2069 c2069 = (C2069) obj3;
                C5362 c5365 = (C5362) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c5365.m9011(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    c0857.mo1173(c2069, c5365, 0);
                } else {
                    c5365.m8982();
                }
                return c2358;
            case 12:
                ((Integer) obj2).getClass();
                C5063.m8616((C2247) obj4, (C2197) obj3, (C5362) obj, AbstractC3831.m6835(1));
                return c2358;
            case 13:
                C1916 c1916 = (C1916) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                c1916.f6312 += ((InterfaceC1437) ((C2889) obj3).f9637).mo927(fFloatValue - c1916.f6312);
                return c2358;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC4225.m7461((C0346) obj4, (InterfaceC4367) obj3, (C5362) obj, AbstractC3831.m6835(49));
                return c2358;
            case 15:
                ((Integer) obj2).getClass();
                AbstractC3933.m7080((InterfaceC0705) obj4, (C0857) obj3, (C5362) obj, AbstractC3831.m6835(49));
                return c2358;
            case 16:
                ((Integer) obj2).getClass();
                ((C0373) obj4).m799((Drawable) obj3, (C5362) obj, AbstractC3831.m6835(49));
                return c2358;
            case 17:
                C3635 c3635 = (C3635) obj4;
                InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj3;
                C5091 c5091 = (C5091) obj;
                Context context = (Context) obj2;
                boolean zM6476 = c3635.m6476();
                C1249 c1249M6484 = c3635.m6484();
                TextClassification textClassification = null;
                String str = c1249M6484 != null ? c1249M6484.f4307 : null;
                C3346 c3347 = c3635.f12160;
                if (c3347 != null) {
                    long j = c3347.f11197;
                    InterfaceC4120 interfaceC4120 = c3635.f12147;
                    c3346 = new C3346(AbstractC2765.m5145(interfaceC4120.mo4319((int) (j >> 32)), interfaceC4120.mo4319((int) (j & 4294967295L))));
                } else {
                    c3346 = null;
                }
                InterfaceC2007 interfaceC2007 = c3635.f12156;
                C3464 c3464 = new C3464(c3635, interfaceC4643, context, 17);
                C4216 c4216 = AbstractC0339.f1263;
                if (Build.VERSION.SDK_INT < 28 || str == null || c3346 == null || interfaceC2007 == null || !(interfaceC2007 instanceof C0385)) {
                    c3464.mo211(c5091);
                    if (str != null && c3346 != null) {
                        AbstractC2552.m4794(c5091, context, zM6476, str, c3346.f11197);
                    }
                } else {
                    C0385 c0385 = (C0385) interfaceC2007;
                    long j2 = c3346.f11197;
                    Object obj6 = c0385.f1438;
                    C1387 c1387 = c0385.f1435;
                    if (c1387.m2951()) {
                        C2828 c2828 = (C2828) c0385.f1441.getValue();
                        TextClassification textClassification2 = (c2828 != null && C3346.m6110(j2, c2828.f9444) && AbstractC3831.m6874(str, c2828.f9445)) ? c2828.f9443 : null;
                        c1387.mo2950(null);
                        textClassification = textClassification2;
                    }
                    if (textClassification == null) {
                        c3464.mo211(c5091);
                    } else {
                        if (!textClassification.getActions().isEmpty()) {
                            c5091.f16885.m5079(new C2102(obj6, textClassification, 0));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            c5091.f16885.m5079(new C2102(obj6, textClassification, -1));
                        }
                        c3464.mo211(c5091);
                        List actions = textClassification.getActions();
                        int size = actions.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            if (i3 > 0) {
                                c5091.f16885.m5079(new C2102(obj6, textClassification, i3));
                            }
                        }
                    }
                    AbstractC2552.m4794(c5091, context, zM6476, str, c3346.f11197);
                }
                return c2358;
            default:
                ((Integer) obj2).getClass();
                AbstractC0495.m1106((C3564) obj4, (InterfaceC5731) obj3, (C5362) obj, AbstractC3831.m6835(1));
                return c2358;
        }
    }

    public /* synthetic */ C4762(int i, Object obj, Object obj2) {
        this.f15713 = i;
        this.f15712 = obj;
        this.f15711 = obj2;
    }
}
