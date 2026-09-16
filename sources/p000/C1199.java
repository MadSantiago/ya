package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۥْٟؒؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1199 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C2432 f4128;

    /* JADX INFO: renamed from: ۥُ */
    public final C2346 f4129;

    /* JADX INFO: renamed from: ۥّ */
    public final C0117 f4130;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3294 f4131;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f4132;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3950 f4133;

    /* JADX INFO: renamed from: ۦۙ */
    public final ArrayList f4134;

    public C1199(Context context, C3294 c3294, C2432 c2432, C2432 c2433, C2432 c2434, C0117 c0117, C4036 c4036) {
        this.f4132 = context;
        this.f4131 = c3294;
        this.f4128 = c2432;
        C2084 c2084M7891 = AbstractC4554.m7891();
        C0649 c0649 = AbstractC0912.f3276;
        this.f4133 = AbstractC4009.m7151(AbstractC4593.m7963(c2084M7891, AbstractC5794.f19088.f17018).mo860(new C0743(this)));
        ComponentCallbacks2C2386 componentCallbacks2C2386 = new ComponentCallbacks2C2386(this);
        C2346 c2346 = new C2346(this, componentCallbacks2C2386);
        this.f4129 = c2346;
        C1414 c1414 = new C1414(c0117);
        int i = 2;
        c1414.m3001(new C1227(i), C0774.class);
        int i2 = 5;
        c1414.m3001(new C1227(i2), String.class);
        int i3 = 1;
        c1414.m3001(new C1227(i3), Uri.class);
        int i4 = 4;
        c1414.m3001(new C1227(i4), Uri.class);
        int i5 = 3;
        c1414.m3001(new C1227(i5), Integer.class);
        int i6 = 0;
        c1414.m3001(new C1227(i6), byte[].class);
        C1032 c1032 = new C1032(1);
        ArrayList arrayList = (ArrayList) c1414.f4869;
        arrayList.add(new C3869(c1032, Uri.class));
        arrayList.add(new C3869(new C1032(0), File.class));
        c1414.m2990(new C2417(c2434, c2433), Uri.class);
        c1414.m2990(new C0409(i2), File.class);
        c1414.m2990(new C0409(i6), Uri.class);
        c1414.m2990(new C0409(i5), Uri.class);
        c1414.m2990(new C0409(6), Uri.class);
        c1414.m2990(new C0409(i4), Drawable.class);
        c1414.m2990(new C0409(i3), Bitmap.class);
        c1414.m2990(new C0409(i), ByteBuffer.class);
        C2809 c2809 = new C2809();
        ArrayList arrayList2 = (ArrayList) c1414.f4870;
        arrayList2.add(c2809);
        List listM4159 = AbstractC2133.m4159((ArrayList) c1414.f4871);
        this.f4130 = new C0117(listM4159, AbstractC2133.m4159((ArrayList) c1414.f4868), AbstractC2133.m4159(arrayList), AbstractC2133.m4159((ArrayList) c1414.f4867), AbstractC2133.m4159(arrayList2));
        this.f4134 = AbstractC0973.m2046(listM4159, new C5284(this, componentCallbacks2C2386, c2346));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ca A[Catch: all -> 0x00ce, TryCatch #6 {all -> 0x00ce, blocks: (B:38:0x00c0, B:40:0x00ca, B:43:0x00d2), top: B:110:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:52:0x013e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0146 A[Catch: all -> 0x0162, TryCatch #1 {all -> 0x0162, blocks: (B:53:0x0140, B:55:0x0146, B:57:0x0152, B:58:0x0157, B:63:0x0164, B:65:0x0168, B:67:0x0174, B:70:0x0184, B:72:0x018a, B:74:0x0194, B:75:0x01a4, B:76:0x01a7), top: B:102:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0152 A[Catch: all -> 0x0162, TryCatch #1 {all -> 0x0162, blocks: (B:53:0x0140, B:55:0x0146, B:57:0x0152, B:58:0x0157, B:63:0x0164, B:65:0x0168, B:67:0x0174, B:70:0x0184, B:72:0x018a, B:74:0x0194, B:75:0x01a4, B:76:0x01a7), top: B:102:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164 A[Catch: all -> 0x0162, TryCatch #1 {all -> 0x0162, blocks: (B:53:0x0140, B:55:0x0146, B:57:0x0152, B:58:0x0157, B:63:0x0164, B:65:0x0168, B:67:0x0174, B:70:0x0184, B:72:0x018a, B:74:0x0194, B:75:0x01a4, B:76:0x01a7), top: B:102:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0168 A[Catch: all -> 0x0162, TryCatch #1 {all -> 0x0162, blocks: (B:53:0x0140, B:55:0x0146, B:57:0x0152, B:58:0x0157, B:63:0x0164, B:65:0x0168, B:67:0x0174, B:70:0x0184, B:72:0x018a, B:74:0x0194, B:75:0x01a4, B:76:0x01a7), top: B:102:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0174 A[Catch: all -> 0x0162, TryCatch #1 {all -> 0x0162, blocks: (B:53:0x0140, B:55:0x0146, B:57:0x0152, B:58:0x0157, B:63:0x0164, B:65:0x0168, B:67:0x0174, B:70:0x0184, B:72:0x018a, B:74:0x0194, B:75:0x01a4, B:76:0x01a7), top: B:102:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x0194 A[Catch: all -> 0x0162, TryCatch #1 {all -> 0x0162, blocks: (B:53:0x0140, B:55:0x0146, B:57:0x0152, B:58:0x0157, B:63:0x0164, B:65:0x0168, B:67:0x0174, B:70:0x0184, B:72:0x018a, B:74:0x0194, B:75:0x01a4, B:76:0x01a7), top: B:102:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cc A[Catch: all -> 0x01f0, TryCatch #0 {all -> 0x01f0, blocks: (B:87:0x01c8, B:89:0x01cc, B:91:0x01db, B:92:0x01e4, B:97:0x01f2, B:98:0x01fb), top: B:101:0x01c8 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01db A[Catch: all -> 0x01f0, TryCatch #0 {all -> 0x01f0, blocks: (B:87:0x01c8, B:89:0x01cc, B:91:0x01db, B:92:0x01e4, B:97:0x01f2, B:98:0x01fb), top: B:101:0x01c8 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01f2 A[Catch: all -> 0x01f0, TRY_ENTER, TryCatch #0 {all -> 0x01f0, blocks: (B:87:0x01c8, B:89:0x01cc, B:91:0x01db, B:92:0x01e4, B:97:0x01f2, B:98:0x01fb), top: B:101:0x01c8 }] */
    /* JADX INFO: renamed from: ۥۣ */
    public final Object m2527(C0834 c0834, AbstractC0772 abstractC0772) {
        C0328 c0328;
        C4931 c4931;
        C0834 c0835;
        C3414 c3414;
        C3414 c3415;
        C0181 c0181;
        C1199 c1199;
        C3414 c3416;
        Bitmap bitmap;
        C4931 c4932;
        C0834 c0836;
        C4931 c4933;
        C3369 c3369;
        AbstractC4586 abstractC4586;
        C4744 c4744;
        C3369 c33610;
        Drawable drawable;
        HashMap map;
        C0838 c0838;
        C4079 c4079;
        C3369 c33611;
        C1199 c11910 = this;
        if (abstractC0772 instanceof C0328) {
            c0328 = (C0328) abstractC0772;
            int i = c0328.f1224;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0328.f1224 = i - Integer.MIN_VALUE;
            } else {
                c0328 = new C0328(c11910, abstractC0772);
            }
        } else {
            c0328 = new C0328(c11910, abstractC0772);
        }
        Object objM5144 = c0328.f1225;
        int i2 = c0328.f1224;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i2 == 0) {
            AbstractC0186.m409(objM5144);
            InterfaceC3196 interfaceC3196M9362 = AbstractC5568.m9362(c0328.f2791);
            c11910.f4129.getClass();
            AbstractC1434 abstractC1434 = c0834.f2972;
            C3414 c3417 = new C3414(abstractC1434, interfaceC3196M9362);
            C2255 c2255 = new C2255(c0834, c0834.f2963);
            c2255.f7474 = c11910.f4131;
            c2255.f7478 = 0;
            C0834 c0834M4298 = c2255.m4298();
            c4931 = C4931.f16247;
            try {
                if (c0834M4298.f2961 == C1397.f4785) {
                    throw new C5496("The request's data is null.");
                }
                abstractC1434.mo2388(c3417);
                AbstractC1434 abstractC1435 = c0834M4298.f2972;
                c0328.f1222 = c11910;
                c0328.f1221 = c3417;
                c0328.f1223 = c0834M4298;
                c0328.f1227 = c4931;
                c0328.f1224 = 1;
                if (C4773.m8150(abstractC1435, c0328) != enumC2282) {
                    c0835 = c0834M4298;
                    c3415 = c3417;
                    if (((C4475) c11910.f4128.getValue()) != null) {
                        c0835.getClass();
                    }
                    c0835.getClass();
                    c0835.f2958.getClass();
                    C3294 c3294 = AbstractC0040.f7816;
                    C3369 c33612 = c0835.f2953;
                    c4931.getClass();
                    C5895 c5895 = c0835.f2975;
                    c0328.f1222 = c11910;
                    c0328.f1221 = c3415;
                    c0328.f1223 = c0835;
                    c0328.f1227 = c4931;
                    c0328.f1228 = null;
                    c0328.f1224 = 2;
                    DisplayMetrics displayMetrics = c5895.f19443.getResources().getDisplayMetrics();
                    C0189 c0189 = new C0189(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
                    c0181 = new C0181(c0189, c0189);
                    if (c0181 != enumC2282) {
                        objM5144 = c0181;
                        c1199 = c11910;
                        c3416 = c3415;
                        bitmap = null;
                        c4932 = c4931;
                        c0836 = c0835;
                        c4932.getClass();
                        AbstractC2132 abstractC2132 = c0836.f2967;
                        C2495 c2495 = new C2495(c0836, c1199, (C0181) objM5144, c4932, bitmap, null, 3);
                        c4933 = c4932;
                        c0328.f1222 = c1199;
                        c0328.f1221 = c3416;
                        c0328.f1223 = c0836;
                        c0328.f1227 = c4933;
                        c0328.f1228 = null;
                        c0328.f1224 = 3;
                        objM5144 = AbstractC2765.m5144(abstractC2132, c2495, c0328);
                        if (objM5144 != enumC2282) {
                            c3414 = c3416;
                            c0835 = c0836;
                            abstractC4586 = (AbstractC4586) objM5144;
                            if (abstractC4586 instanceof C4079) {
                                c4079 = (C4079) abstractC4586;
                                c33611 = c0835.f2953;
                                c1199.getClass();
                                C0834 c0837 = c4079.f13598;
                                if (c33611 != null) {
                                    c33611.m6137(c4079.f13599);
                                }
                                c4933.getClass();
                                c0837.getClass();
                            } else if (abstractC4586 instanceof C4744) {
                                c4744 = (C4744) abstractC4586;
                                c33610 = c0835.f2953;
                                c1199.getClass();
                                C0834 c0839 = c4744.f15672;
                                if (c33610 != null) {
                                    drawable = c4744.f15673;
                                    map = C2922.f9822;
                                    c0838 = (C0838) c33610.f11255;
                                    if (map.remove(c0838) != null) {
                                        if (drawable.getBounds().isEmpty()) {
                                            drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
                                        }
                                        c0838.m1750(drawable);
                                    }
                                }
                                c4933.getClass();
                                c0839.getClass();
                            }
                            c3414.f11372.mo2389(c3414);
                            return abstractC4586;
                        }
                    }
                }
                return enumC2282;
            } catch (Throwable th) {
                th = th;
                c0835 = c0834M4298;
                c3414 = c3417;
            }
        } else if (i2 == 1) {
            C4931 c4934 = c0328.f1227;
            c0835 = c0328.f1223;
            c3415 = c0328.f1221;
            C1199 c11911 = c0328.f1222;
            try {
                AbstractC0186.m409(objM5144);
                c4931 = c4934;
                c11910 = c11911;
                try {
                    if (((C4475) c11910.f4128.getValue()) != null) {
                        c0835.getClass();
                    }
                    c0835.getClass();
                    c0835.f2958.getClass();
                    C3294 c3295 = AbstractC0040.f7816;
                    C3369 c33613 = c0835.f2953;
                    c4931.getClass();
                    C5895 c5896 = c0835.f2975;
                    c0328.f1222 = c11910;
                    c0328.f1221 = c3415;
                    c0328.f1223 = c0835;
                    c0328.f1227 = c4931;
                    c0328.f1228 = null;
                    c0328.f1224 = 2;
                    DisplayMetrics displayMetrics2 = c5896.f19443.getResources().getDisplayMetrics();
                    C0189 c01810 = new C0189(Math.max(displayMetrics2.widthPixels, displayMetrics2.heightPixels));
                    c0181 = new C0181(c01810, c01810);
                    if (c0181 != enumC2282) {
                        objM5144 = c0181;
                        c1199 = c11910;
                        c3416 = c3415;
                        bitmap = null;
                        c4932 = c4931;
                        c0836 = c0835;
                        c4932.getClass();
                        AbstractC2132 abstractC2133 = c0836.f2967;
                        C2495 c2496 = new C2495(c0836, c1199, (C0181) objM5144, c4932, bitmap, null, 3);
                        c4933 = c4932;
                        c0328.f1222 = c1199;
                        c0328.f1221 = c3416;
                        c0328.f1223 = c0836;
                        c0328.f1227 = c4933;
                        c0328.f1228 = null;
                        c0328.f1224 = 3;
                        objM5144 = AbstractC2765.m5144(abstractC2133, c2496, c0328);
                        if (objM5144 != enumC2282) {
                            c3414 = c3416;
                            c0835 = c0836;
                            abstractC4586 = (AbstractC4586) objM5144;
                            if (abstractC4586 instanceof C4079) {
                                c4079 = (C4079) abstractC4586;
                                c33611 = c0835.f2953;
                                c1199.getClass();
                                C0834 c08310 = c4079.f13598;
                                if (c33611 != null) {
                                    c33611.m6137(c4079.f13599);
                                }
                                c4933.getClass();
                                c08310.getClass();
                            } else if (abstractC4586 instanceof C4744) {
                                c4744 = (C4744) abstractC4586;
                                c33610 = c0835.f2953;
                                c1199.getClass();
                                C0834 c08311 = c4744.f15672;
                                if (c33610 != null) {
                                    drawable = c4744.f15673;
                                    map = C2922.f9822;
                                    c0838 = (C0838) c33610.f11255;
                                    if (map.remove(c0838) != null) {
                                        if (drawable.getBounds().isEmpty()) {
                                            drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
                                        }
                                        c0838.m1750(drawable);
                                    }
                                }
                                c4933.getClass();
                                c08311.getClass();
                            }
                            c3414.f11372.mo2389(c3414);
                            return abstractC4586;
                        }
                    }
                    return enumC2282;
                } catch (Throwable th2) {
                    th = th2;
                    c3414 = c3415;
                }
            } catch (Throwable th3) {
                th = th3;
                c4931 = c4934;
                c3414 = c3415;
                c11910 = c11911;
            }
        } else if (i2 == 2) {
            Bitmap bitmap2 = c0328.f1228;
            C4931 c4935 = c0328.f1227;
            c0835 = c0328.f1223;
            c3416 = c0328.f1221;
            C1199 c11912 = c0328.f1222;
            try {
                AbstractC0186.m409(objM5144);
                bitmap = bitmap2;
                c4932 = c4935;
                c1199 = c11912;
                c0836 = c0835;
                try {
                    c4932.getClass();
                    AbstractC2132 abstractC2134 = c0836.f2967;
                    C2495 c2497 = new C2495(c0836, c1199, (C0181) objM5144, c4932, bitmap, null, 3);
                    c4933 = c4932;
                    try {
                        c0328.f1222 = c1199;
                        c0328.f1221 = c3416;
                        c0328.f1223 = c0836;
                        c0328.f1227 = c4933;
                        c0328.f1228 = null;
                        c0328.f1224 = 3;
                        objM5144 = AbstractC2765.m5144(abstractC2134, c2497, c0328);
                        if (objM5144 != enumC2282) {
                            c3414 = c3416;
                            c0835 = c0836;
                            abstractC4586 = (AbstractC4586) objM5144;
                            if (abstractC4586 instanceof C4079) {
                                c4079 = (C4079) abstractC4586;
                                c33611 = c0835.f2953;
                                c1199.getClass();
                                C0834 c08312 = c4079.f13598;
                                if (c33611 != null) {
                                    c33611.m6137(c4079.f13599);
                                }
                                c4933.getClass();
                                c08312.getClass();
                            } else if (abstractC4586 instanceof C4744) {
                                c4744 = (C4744) abstractC4586;
                                c33610 = c0835.f2953;
                                c1199.getClass();
                                C0834 c08313 = c4744.f15672;
                                if (c33610 != null) {
                                    drawable = c4744.f15673;
                                    map = C2922.f9822;
                                    c0838 = (C0838) c33610.f11255;
                                    if (map.remove(c0838) != null) {
                                        if (drawable.getBounds().isEmpty()) {
                                            drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
                                        }
                                        c0838.m1750(drawable);
                                    }
                                }
                                c4933.getClass();
                                c08313.getClass();
                            }
                            c3414.f11372.mo2389(c3414);
                            return abstractC4586;
                        }
                        return enumC2282;
                    } catch (Throwable th4) {
                        th = th4;
                        c4931 = c4933;
                        c3414 = c3416;
                        c0835 = c0836;
                        c11910 = c1199;
                        if (th instanceof CancellationException) {
                            c11910.getClass();
                            c4931.getClass();
                            c0835.getClass();
                            throw th;
                        }
                        c11910.f4129.getClass();
                        C4744 c4744M4394 = C2346.m4394(c0835, th);
                        c3369 = c0835.f2953;
                        C0834 c08314 = c4744M4394.f15672;
                        if (c3369 != null) {
                            C2922.f9822.remove((C0838) c3369.f11255);
                        }
                        c4931.getClass();
                        c08314.getClass();
                        c3414.f11372.mo2389(c3414);
                        return c4744M4394;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c4933 = c4932;
                }
            } catch (Throwable th6) {
                th = th6;
                c4931 = c4935;
                c3414 = c3416;
                c11910 = c11912;
            }
        } else {
            if (i2 != 3) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4933 = c0328.f1227;
            c0835 = c0328.f1223;
            c3414 = c0328.f1221;
            C1199 c11913 = c0328.f1222;
            try {
                AbstractC0186.m409(objM5144);
                c1199 = c11913;
                try {
                    abstractC4586 = (AbstractC4586) objM5144;
                    if (abstractC4586 instanceof C4079) {
                        c4079 = (C4079) abstractC4586;
                        c33611 = c0835.f2953;
                        c1199.getClass();
                        C0834 c08315 = c4079.f13598;
                        if (c33611 != null) {
                            c33611.m6137(c4079.f13599);
                        }
                        c4933.getClass();
                        c08315.getClass();
                    } else if (abstractC4586 instanceof C4744) {
                        c4744 = (C4744) abstractC4586;
                        c33610 = c0835.f2953;
                        c1199.getClass();
                        C0834 c08316 = c4744.f15672;
                        if (c33610 != null) {
                            drawable = c4744.f15673;
                            map = C2922.f9822;
                            c0838 = (C0838) c33610.f11255;
                            if (map.remove(c0838) != null && drawable != null && c0838.getCallback() != null) {
                                if (drawable.getBounds().isEmpty()) {
                                    drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
                                }
                                c0838.m1750(drawable);
                            }
                        }
                        c4933.getClass();
                        c08316.getClass();
                    }
                    c3414.f11372.mo2389(c3414);
                    return abstractC4586;
                } catch (Throwable th7) {
                    th = th7;
                    c4931 = c4933;
                    c11910 = c1199;
                    if (th instanceof CancellationException) {
                        c11910.getClass();
                        c4931.getClass();
                        c0835.getClass();
                        throw th;
                    }
                    c11910.f4129.getClass();
                    C4744 c4744M4395 = C2346.m4394(c0835, th);
                    c3369 = c0835.f2953;
                    C0834 c08317 = c4744M4395.f15672;
                    if (c3369 != null) {
                        C2922.f9822.remove((C0838) c3369.f11255);
                    }
                    c4931.getClass();
                    c08317.getClass();
                    c3414.f11372.mo2389(c3414);
                    return c4744M4395;
                }
            } catch (Throwable th8) {
                th = th8;
                c4931 = c4933;
                c11910 = c11913;
            }
        }
        try {
            if (th instanceof CancellationException) {
                c11910.getClass();
                c4931.getClass();
                c0835.getClass();
                throw th;
            }
            c11910.f4129.getClass();
            C4744 c4744M4396 = C2346.m4394(c0835, th);
            c3369 = c0835.f2953;
            C0834 c08318 = c4744M4396.f15672;
            if (c3369 != null) {
                C2922.f9822.remove((C0838) c3369.f11255);
            }
            c4931.getClass();
            c08318.getClass();
            c3414.f11372.mo2389(c3414);
            return c4744M4396;
        } catch (Throwable th9) {
            c3414.f11372.mo2389(c3414);
            throw th9;
        }
    }
}
