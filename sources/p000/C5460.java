package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.work.impl.foreground.SystemForegroundService;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.logging.Level;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ۦٖۡؔۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5460 implements InterfaceC5641, InterfaceC4895, InterfaceC1170, InterfaceC3665, InterfaceC2697 {

    /* JADX INFO: renamed from: ۥَ */
    public static C5460 f17996;

    /* JADX INFO: renamed from: ۥٖ */
    public static C5460 f17997;

    /* JADX INFO: renamed from: ۦٗ */
    public static Boolean f17998;

    /* JADX INFO: renamed from: ۥْ */
    public Object f17999;

    /* JADX INFO: renamed from: ۥٓ */
    public Object f18000;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f18001;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18002;

    public C5460(int i) {
        this.f18002 = i;
        switch (i) {
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f18001 = new WeakHashMap();
                this.f17999 = new WeakHashMap();
                this.f18000 = new WeakHashMap();
                break;
            case 9:
                this.f18001 = new C0606("", 0L, null);
                this.f17999 = new C0606("", 0L, null);
                this.f18000 = new ArrayList();
                break;
            case 16:
                this.f18001 = new AtomicBoolean(false);
                new ConcurrentHashMap();
                this.f17999 = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.f18000 = new ConcurrentHashMap();
                break;
            default:
                this.f18001 = new AtomicReference(AbstractC2774.f9241);
                this.f17999 = new Object();
                break;
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static C5460 m9119(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C5460(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    @Override // p000.InterfaceC1170
    public void accept(Object obj, Object obj2) {
        C3663 c3663 = (C3663) ((C5390) obj).m7333();
        BinderC0222 binderC0222 = new BinderC0222((C1543) this.f18001, (C1795) this.f18000);
        String str = (String) this.f17999;
        Parcel parcelM7504 = c3663.m7504();
        parcelM7504.writeString(str);
        AbstractC5564.m9344(parcelM7504, binderC0222);
        c3663.m7505(parcelM7504, 28);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f18002) {
            case 9:
                C5460 c5460 = new C5460(((C0606) this.f18001).clone());
                Iterator it = ((ArrayList) this.f18000).iterator();
                while (it.hasNext()) {
                    ((ArrayList) c5460.f18000).add(((C0606) it.next()).clone());
                }
                return c5460;
            default:
                return super.clone();
        }
    }

    @Override // p000.InterfaceC4895
    public Object get() {
        switch (this.f18002) {
            case 1:
                return new C4589((InterfaceC3534) ((InterfaceC5641) this.f18001).get(), (C3729) ((InterfaceC5641) this.f17999).get(), (InterfaceC1015) ((InterfaceC5641) this.f18000).get());
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                long jM6841 = AbstractC3831.m6841();
                if (jM6841 == AbstractC4519.f14933) {
                    return this.f18000;
                }
                C4619 c4619 = (C4619) ((AtomicReference) this.f18001).get();
                int iM8011 = c4619.m8011(jM6841);
                if (iM8011 >= 0) {
                    return c4619.f15242[iM8011];
                }
                return null;
            default:
                return new C4046(new C4575(4), new C4369(3), (C1934) ((C1414) this.f18001).get(), (C0474) ((C3571) this.f17999).get(), (C1489) ((C1489) this.f18000).get());
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public ColorStateList m9120(int i) {
        int resourceId;
        ColorStateList colorStateListM7481;
        TypedArray typedArray = (TypedArray) this.f17999;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM7481 = AbstractC4225.m7481((Context) this.f18001, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM7481;
    }

    /* JADX INFO: renamed from: ۥُ */
    public Drawable m9121(int i) {
        int resourceId;
        Drawable drawableM307;
        if (!((TypedArray) this.f17999).hasValue(i) || (resourceId = ((TypedArray) this.f17999).getResourceId(i, 0)) == 0) {
            return null;
        }
        C3465 c3465M6241 = C3465.m6241();
        Context context = (Context) this.f18001;
        synchronized (c3465M6241) {
            drawableM307 = c3465M6241.f11498.m307(context, resourceId, true);
        }
        return drawableM307;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ۥّ */
    public Typeface m9122(int i, int i2, C0835 c0835) throws Throwable {
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f17999).getResourceId(i, 0);
        Typeface typefaceM5899 = null;
        if (resourceId != 0) {
            TypedValue typedValue = (TypedValue) this.f18000;
            if (typedValue == null) {
                typedValue = new TypedValue();
                this.f18000 = typedValue;
            }
            Context context = (Context) this.f18001;
            ThreadLocal threadLocal = AbstractC2365.f7832;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (string.startsWith("res/")) {
                    int i3 = typedValue.assetCookie;
                    C2094 c2094 = AbstractC3211.f10769;
                    Typeface typeface = (Typeface) c2094.m4035(AbstractC3211.m5898(resources, resourceId, string, i3, i2));
                    int i4 = 18;
                    if (typeface != null) {
                        if (c0835 != null) {
                            new Handler(Looper.getMainLooper()).post(new RunnableC5689(i4, c0835, typeface));
                        }
                        c0835 = c0835;
                        typefaceM5899 = typeface;
                    } else {
                        try {
                            try {
                                if (string.toLowerCase().endsWith(".xml")) {
                                    InterfaceC3953 interfaceC3953M3414 = AbstractC1631.m3414(resources.getXml(resourceId), resources);
                                    if (interfaceC3953M3414 == null) {
                                        try {
                                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                                            if (c0835 != null) {
                                                c0835.m1735(-3);
                                            }
                                        } catch (IOException e) {
                                            iOException = e;
                                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                                            if (c0835 != 0) {
                                                c0835.m1735(-3);
                                            }
                                        } catch (XmlPullParserException e2) {
                                            xmlPullParserException = e2;
                                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                                            if (c0835 != 0) {
                                                c0835.m1735(-3);
                                            }
                                        }
                                    } else {
                                        c0835 = c0835;
                                        typefaceM5899 = AbstractC3211.m5899(context, interfaceC3953M3414, resources, resourceId, string, typedValue.assetCookie, i2, c0835, true);
                                    }
                                } else {
                                    c0835 = c0835;
                                    int i5 = typedValue.assetCookie;
                                    Typeface typefaceMo2709 = AbstractC3211.f10770.mo2709(context, resources, resourceId, string);
                                    if (typefaceMo2709 != null) {
                                        c2094.m4041(AbstractC3211.m5898(resources, resourceId, string, i5, i2), typefaceMo2709);
                                    }
                                    if (c0835 != null) {
                                        if (typefaceMo2709 != null) {
                                            new Handler(Looper.getMainLooper()).post(new RunnableC5689(i4, c0835, typefaceMo2709));
                                        } else {
                                            c0835.m1735(-3);
                                        }
                                    }
                                    typefaceM5899 = typefaceMo2709;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                                if (c0835 != 0) {
                                    c0835.m1735(-3);
                                }
                                if (typefaceM5899 == null) {
                                }
                                return typefaceM5899;
                            } catch (XmlPullParserException e4) {
                                e = e4;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                                if (c0835 != 0) {
                                    c0835.m1735(-3);
                                }
                                if (typefaceM5899 == null) {
                                }
                                return typefaceM5899;
                            }
                        } catch (IOException e5) {
                            e = e5;
                        } catch (XmlPullParserException e6) {
                            e = e6;
                        }
                    }
                    if (typefaceM5899 == null || c0835 != null) {
                        return typefaceM5899;
                    }
                    throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(resourceId) + " could not be retrieved.");
                }
                if (c0835 != null) {
                    c0835.m1735(-3);
                }
                c0835 = c0835;
                if (typefaceM5899 == null) {
                }
                return typefaceM5899;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[PHI: r11
  0x0033: PHI (r11v9 int) = (r11v1 int), (r11v0 int) binds: [B:9:0x0018, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x006a  */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    @Override // p000.InterfaceC3665
    /* JADX INFO: renamed from: ۥۗ */
    public void mo6147(int i, Throwable th, byte[] bArr) {
        EnumC5547 enumC5547;
        C5235 c5235 = (C5235) this.f18001;
        c5235.mo6517();
        C5571 c5571 = (C5571) this.f18000;
        if (i == 200 || i == 204) {
            if (th == null) {
                C3610 c3610 = ((C5371) c5235.f18660).f17717;
                C5371.m9020(c3610);
                c3610.f12023.m9430(Long.valueOf(c5571.f18403), "[sgtm] Upload succeeded for row_id");
                enumC5547 = EnumC5547.f18319;
            } else {
                C3610 c3611 = ((C5371) c5235.f18660).f17717;
                C5371.m9020(c3611);
                c3611.f12022.m9431("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(c5571.f18403), Integer.valueOf(i), th);
                if (Arrays.asList(((String) AbstractC4936.f16329.m4592(null)).split(",")).contains(String.valueOf(i))) {
                    enumC5547 = EnumC5547.f18318;
                } else {
                    enumC5547 = EnumC5547.f18320;
                }
            }
        } else if (i == 304) {
            i = 304;
            if (th == null) {
                C3610 c3612 = ((C5371) c5235.f18660).f17717;
                C5371.m9020(c3612);
                c3612.f12023.m9430(Long.valueOf(c5571.f18403), "[sgtm] Upload succeeded for row_id");
                enumC5547 = EnumC5547.f18319;
            } else {
                C3610 c3613 = ((C5371) c5235.f18660).f17717;
                C5371.m9020(c3613);
                c3613.f12022.m9431("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(c5571.f18403), Integer.valueOf(i), th);
                if (Arrays.asList(((String) AbstractC4936.f16329.m4592(null)).split(",")).contains(String.valueOf(i))) {
                    enumC5547 = EnumC5547.f18318;
                } else {
                    enumC5547 = EnumC5547.f18320;
                }
            }
        } else {
            C3610 c3614 = ((C5371) c5235.f18660).f17717;
            C5371.m9020(c3614);
            c3614.f12022.m9431("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(c5571.f18403), Integer.valueOf(i), th);
            if (Arrays.asList(((String) AbstractC4936.f16329.m4592(null)).split(",")).contains(String.valueOf(i))) {
                enumC5547 = EnumC5547.f18318;
            } else {
                enumC5547 = EnumC5547.f18320;
            }
        }
        AtomicReference atomicReference = (AtomicReference) this.f17999;
        C5695 c5695M9028 = ((C5371) c5235.f18660).m9028();
        long j = c5571.f18403;
        C0323 c0323 = new C0323(enumC5547.f18323, j, c5571.f18400);
        c5695M9028.mo6517();
        c5695M9028.m7643();
        c5695M9028.m9509(new RunnableC0624(9, c5695M9028, c5695M9028.m9517(true), c0323, false));
        C3610 c3615 = ((C5371) c5235.f18660).f17717;
        C5371.m9020(c3615);
        c3615.f12023.m9434(Long.valueOf(j), enumC5547, "[sgtm] Updated status for row_id");
        synchronized (atomicReference) {
            atomicReference.set(enumC5547);
            atomicReference.notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x006b A[Catch: all -> 0x0023, PHI: r10
  0x006b: PHI (r10v7 int) = (r10v1 int), (r10v0 int) binds: [B:14:0x0030, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.InterfaceC2697
    /* JADX INFO: renamed from: ۥۣ */
    public void mo5024(String str, int i, Throwable th, byte[] bArr, Map map) {
        C1518 c1518;
        C1159 c1159;
        String strSubstring;
        Object obj;
        switch (this.f18002) {
            case 17:
                ((C5034) this.f18000).m8491(true, i, th, bArr, (String) this.f18001, (ArrayList) this.f17999, map);
                return;
            default:
                long j = ((C1212) this.f17999).f4191;
                C5034 c5034 = (C5034) this.f18000;
                String str2 = (String) this.f18001;
                c5034.mo2406().mo6517();
                c5034.m8490();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } finally {
                        c5034.f16683 = false;
                        c5034.m8542();
                    }
                }
                if (i == 200) {
                    if (th == null) {
                        C1159 c11510 = c5034.f16670;
                        C5034.m8484(c11510);
                        c11510.m2459(Long.valueOf(j));
                        c5034.mo2404().f12023.m9434(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                        c1518 = c5034.f16696;
                        C5034.m8484(c1518);
                        if (c1518.m3250()) {
                            c1159 = c5034.f16670;
                            C5034.m8484(c1159);
                            if (c1159.m2436(str2)) {
                                c5034.m8500(str2);
                            } else {
                                c5034.m8539();
                            }
                        } else {
                            c5034.m8539();
                        }
                    } else {
                        String str3 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str3.substring(0, Math.min(32, str3.length()));
                        C5590 c5590 = c5034.mo2404().f12021;
                        Integer numValueOf = Integer.valueOf(i);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        c5590.m9431("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                        C1159 c11511 = c5034.f16670;
                        C5034.m8484(c11511);
                        c11511.m2423(Long.valueOf(j));
                        c5034.m8539();
                    }
                } else if (i == 204) {
                    i = 204;
                    if (th == null) {
                        C1159 c11512 = c5034.f16670;
                        C5034.m8484(c11512);
                        c11512.m2459(Long.valueOf(j));
                        c5034.mo2404().f12023.m9434(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                        c1518 = c5034.f16696;
                        C5034.m8484(c1518);
                        if (c1518.m3250()) {
                            c1159 = c5034.f16670;
                            C5034.m8484(c1159);
                            if (c1159.m2436(str2)) {
                                c5034.m8500(str2);
                            } else {
                                c5034.m8539();
                            }
                        } else {
                            c5034.m8539();
                        }
                    } else {
                        String str4 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str4.substring(0, Math.min(32, str4.length()));
                        C5590 c5591 = c5034.mo2404().f12021;
                        Integer numValueOf2 = Integer.valueOf(i);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        c5591.m9431("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                        C1159 c11513 = c5034.f16670;
                        C5034.m8484(c11513);
                        c11513.m2423(Long.valueOf(j));
                        c5034.m8539();
                    }
                } else {
                    String str5 = new String(bArr, StandardCharsets.UTF_8);
                    strSubstring = str5.substring(0, Math.min(32, str5.length()));
                    C5590 c5592 = c5034.mo2404().f12021;
                    Integer numValueOf3 = Integer.valueOf(i);
                    obj = th;
                    if (th == null) {
                        obj = strSubstring;
                    }
                    c5592.m9431("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
                    C1159 c11514 = c5034.f16670;
                    C5034.m8484(c11514);
                    c11514.m2423(Long.valueOf(j));
                    c5034.m8539();
                }
                return;
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public Drawable m9123(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f17999;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC4225.m7464((Context) this.f18001, resourceId);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public C4752 m9124() {
        String strSubstring;
        int i;
        C4706 c4706;
        C4706 c4707;
        String str = (String) this.f18000;
        C0996 c0996 = (C0996) this.f18001;
        InterfaceC3077 interfaceC3077 = c0996.f3560;
        int i2 = 6;
        int i3 = 3;
        if (!AbstractC0949.m1942(c0996.f3561)) {
            return new C4752(C0268.m548(), new C2268(i3, 17, i2));
        }
        Boolean boolValueOf = f17998;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
                f17998 = boolValueOf;
            } else {
                try {
                    Object objInvoke = Process.class.getMethod("isIsolated", null).invoke(Process.class, null);
                    objInvoke.getClass();
                    boolValueOf = (Boolean) objInvoke;
                    f17998 = boolValueOf;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                    f17998 = boolValueOf;
                }
            }
        }
        if (boolValueOf.booleanValue()) {
            return new C4752(C0268.m548(), new C2268(i3, 18, i2));
        }
        C4471 c4471M6952 = c0996.f3566.m6952();
        AbstractC4314 abstractC4314 = c4471M6952.f14738;
        EnumC0885 enumC0885 = EnumC0885.f3221;
        C4461 c4461 = AbstractC4385.f14451;
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            strSubstring = str.substring(0, iIndexOf);
        } else {
            if (str.contains("@")) {
                C1078.m2272("Invalid package name: ".concat(str));
                return null;
            }
            strSubstring = str;
        }
        int i4 = 5;
        if (!c4471M6952.f14742) {
            i = 14;
        } else if (!c4471M6952.f14743 || !c4471M6952.f14741.contains(enumC0885)) {
            i = 3;
        } else if (abstractC4314.mo7605() != 0) {
            List list = c4471M6952.f14740;
            if (list.isEmpty() || list.contains(strSubstring)) {
                i = c4471M6952.f14748.contains(strSubstring) ? 6 : 0;
            } else {
                i = 5;
            }
        } else {
            i = 4;
        }
        int i5 = 7;
        if (i != 0) {
            c4707 = new C4706(null, new C2268(i));
        } else {
            try {
                String str2 = c4471M6952.f14739;
                if (str2.isEmpty()) {
                    AbstractC3538 abstractC3538 = (AbstractC3538) c0996.f3562.get();
                    if (abstractC3538.mo3984()) {
                        str2 = ((ApplicationInfo) abstractC3538.mo3985()).dataDir;
                    } else {
                        AbstractC1631.m3424(Level.WARNING, c0996.m2177(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                        c4706 = new C4706(C0336.f1251, new C2268(i3, i5, i2));
                        c4707 = c4706;
                    }
                }
                String str3 = File.separator;
                String str4 = c4471M6952.f14744;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
                sb.append(str2);
                sb.append(str3);
                sb.append(str4);
                String string = sb.toString();
                C5460 c5460 = new C5460(abstractC4314, str);
                Uri.Builder builderScheme = new Uri.Builder().scheme("file");
                String string2 = c5460.m9125().toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + string.length() + String.valueOf(str3).length() + string2.length());
                sb2.append(str3);
                sb2.append(string);
                sb2.append(str3);
                sb2.append(string2);
                Uri uriBuild = builderScheme.appendEncodedPath(sb2.toString()).build();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        C4706 c4708 = new C4706((C0336) ((C4810) interfaceC3077.get()).m8183(uriBuild, new C2942(c4471M6952.f14747.m7281())), new C2268(i4, 2, i2));
                        StrictMode.setThreadPolicy(threadPolicy);
                        c4707 = c4708;
                    } catch (FileNotFoundException unused2) {
                        AbstractC1631.m3424(Level.INFO, c0996.m2177(), null, "Shared storage file not found for %s", str);
                        c4707 = new C4706(null, new C2268(8));
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (C5463 e) {
                        AbstractC1631.m3424(Level.SEVERE, c0996.m2177(), e, "Failed to parse snapshot from shared storage for %s", str);
                        c4707 = new C4706(null, new C2268(9));
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
            } catch (Exception e2) {
                AbstractC1631.m3424(Level.WARNING, c0996.m2177(), e2, "Failed to read shared file for %s", str);
                c4706 = new C4706(C0336.f1251, new C2268(i3, 10, i2));
                c4707 = c4706;
            }
        }
        C2268 c2268 = c4707.f15521;
        C0336 c0336 = c4707.f15522;
        if (c0336 != null) {
            return new C4752(c0336, c2268);
        }
        int i6 = c2268.f7526;
        try {
            C4810 c4810 = (C4810) interfaceC3077.get();
            Uri uri = (Uri) this.f17999;
            InterfaceC4089 interfaceC4089 = (InterfaceC4089) C0268.m548().mo554(7);
            C2955 c2955 = C2955.f9912;
            int i7 = AbstractC5529.f18251;
            C2955 c2956 = C2955.f9911;
            InputStream inputStreamM8131 = C4773.m8131(c4810.m8182(uri));
            try {
                AbstractC5212 abstractC5212M7675 = ((C4377) interfaceC4089).m7675(inputStreamM8131, c2956);
                if (inputStreamM8131 != null) {
                    inputStreamM8131.close();
                }
                return new C4752((C0268) abstractC5212M7675, new C2268(4, i6, i2));
            } catch (Throwable th2) {
                if (inputStreamM8131 == null) {
                    throw th2;
                }
                try {
                    inputStreamM8131.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (IOException | RuntimeException unused3) {
            AbstractC1631.m3424(Level.INFO, c0996.m2177(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str);
            return m9131() ? new C4752(C0336.f1251, new C2268(i3, 16, i2)) : new C4752(C0268.m548(), new C2268(i3, 11, i2));
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public File m9125() {
        String str = (String) ((InterfaceC3077) this.f17999).get();
        String str2 = (String) ((InterfaceC3077) this.f18000).get();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3);
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(".pb");
        return new File(sb.toString());
    }

    /* JADX INFO: renamed from: ۦِ */
    public void m9126() {
        ((TypedArray) this.f17999).recycle();
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void m9127(EnumC1924 enumC1924) {
        RunnableC1366 runnableC1366 = (RunnableC1366) this.f18000;
        if (runnableC1366 != null) {
            runnableC1366.run();
        }
        RunnableC1366 runnableC1367 = new RunnableC1366((C4170) this.f18001, enumC1924);
        this.f18000 = runnableC1367;
        ((Handler) this.f17999).postAtFrontOfQueue(runnableC1367);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public void m9128(Object obj) {
        long jM6841 = AbstractC3831.m6841();
        if (jM6841 == AbstractC4519.f14933) {
            this.f18000 = obj;
            return;
        }
        synchronized (this.f17999) {
            C4619 c4619 = (C4619) ((AtomicReference) this.f18001).get();
            int iM8011 = c4619.m8011(jM6841);
            if (iM8011 < 0) {
                ((AtomicReference) this.f18001).set(c4619.m8010(jM6841, obj));
            } else {
                c4619.f15242[iM8011] = obj;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public boolean m9129() {
        if (((InterfaceC5372) this.f18001).getValue() != this.f18000) {
            return true;
        }
        C5460 c5460 = (C5460) this.f17999;
        return c5460 != null && c5460.m9129();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x004f A[EDGE_INSN: B:57:0x004f->B:55:0x004f BREAK  A[LOOP:1: B:25:0x0071->B:60:?], SYNTHETIC] */
    /* JADX INFO: renamed from: ۦۚ */
    public void m9130(AbstractC4314 abstractC4314, Set set, String str) {
        C5194[] c5194Arr;
        if (!set.isEmpty() && !((AtomicBoolean) this.f18001).getAndSet(true)) {
            if (C5086.f16875 == null) {
                synchronized (C5086.class) {
                    try {
                        if (C5086.f16875 == null) {
                            C5086.f16875 = new C5086(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ((CopyOnWriteArrayList) C5086.f16875.f16877).add(0, new C1745(21));
        }
        final byte[] bArrM7608 = abstractC4314.m7608();
        ((ConcurrentHashMap) this.f17999).compute(str, new BiFunction() { // from class: ۥٌَۛؖ
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = bArrM7608;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) ((ConcurrentHashMap) this.f18000).putIfAbsent((String) it.next(), new AtomicReference(new C5194(str, bArrM7608)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof C5194) {
                        C5194 c5194 = (C5194) obj;
                        if (str.equals(c5194.f17183)) {
                            c5194.m8803(bArrM7608);
                            break;
                        }
                        C5194 c5195 = new C5194(str, bArrM7608);
                        c5194Arr = str.compareTo(c5194.f17183) < 0 ? new C5194[]{c5195, c5194} : new C5194[]{c5194, c5195};
                        do {
                            if (atomicReference.compareAndSet(obj, c5194Arr)) {
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    } else {
                        C5194[] c5194Arr2 = (C5194[]) obj;
                        int iBinarySearch = Arrays.binarySearch(c5194Arr2, str);
                        if (iBinarySearch >= 0) {
                            c5194Arr2[iBinarySearch].m8803(bArrM7608);
                            break;
                        }
                        int i = ~iBinarySearch;
                        int length = c5194Arr2.length;
                        int i2 = length + 1;
                        int i3 = length - i;
                        if (i3 == 0) {
                            c5194Arr = (C5194[]) Arrays.copyOf(c5194Arr2, i2);
                        } else {
                            C5194[] c5194Arr3 = new C5194[i2];
                            System.arraycopy(c5194Arr2, 0, c5194Arr3, 0, i);
                            System.arraycopy(c5194Arr2, i, c5194Arr3, i + 1, i3);
                            c5194Arr = c5194Arr3;
                        }
                        c5194Arr[i] = new C5194(str, bArrM7608);
                        do {
                            if (atomicReference.compareAndSet(obj, c5194Arr)) {
                                break;
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean m9131() {
        C4357 c4357M6951 = ((C0996) this.f18001).f3566.m6951();
        return c4357M6951.m7655() && ((AbstractCollection) c4357M6951.m7656()).contains(EnumC0885.f3221);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public synchronized void m9132(int i, int i2, long j, long j2) {
        ((C5371) this.f18001).f17719.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f18000;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        C3580 c3580M6325 = ((C3535) this.f17999).m6325(new C0307(0, Arrays.asList(new C2923(36301, i, 0, j, j2, null, null, 0, i2))));
        C3250 c3250 = new C3250(jElapsedRealtime, this);
        c3580M6325.getClass();
        c3580M6325.m6391(AbstractC4007.f13360, c3250);
    }

    public /* synthetic */ C5460(C5034 c5034, String str, Object obj, int i) {
        this.f18002 = i;
        this.f18001 = str;
        this.f17999 = obj;
        this.f18000 = c5034;
    }

    public C5460(Context context, C5371 c5371) {
        this.f18002 = 12;
        this.f18000 = new AtomicLong(-1L);
        this.f17999 = new C3535(context, C3535.f11725, new C3946("measurement:api"), C1540.f5214);
        this.f18001 = c5371;
    }

    public C5460(AbstractC4314 abstractC4314, String str) {
        this.f18002 = 15;
        this.f18001 = C2748.f9093;
        this.f17999 = AbstractC3933.m7074(new C2346(29, this, abstractC4314));
        this.f18000 = AbstractC3933.m7074(new C2346(28, this, str));
    }

    public C5460(C0996 c0996, String str) {
        this.f18002 = 19;
        this.f18001 = c0996;
        this.f18000 = str;
        Context context = c0996.f3561;
        Pattern pattern = AbstractC1410.f4847;
        C2813 c2813 = new C2813(context);
        c2813.m5378("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("/");
        sb.append(str);
        sb.append(".pb");
        c2813.m5368(sb.toString());
        this.f17999 = c2813.m5369();
    }

    public C5460(C0606 c0606) {
        this.f18002 = 9;
        this.f18001 = c0606;
        this.f17999 = c0606.clone();
        this.f18000 = new ArrayList();
    }

    public C5460(SystemForegroundService systemForegroundService) {
        this.f18002 = 0;
        this.f18001 = new C4170(systemForegroundService, true);
        this.f17999 = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ C5460(Object obj, Object obj2, Object obj3, int i) {
        this.f18002 = i;
        this.f18001 = obj;
        this.f17999 = obj2;
        this.f18000 = obj3;
    }

    public C5460(Context context, TypedArray typedArray) {
        this.f18002 = 3;
        this.f18001 = context;
        this.f17999 = typedArray;
    }

    public C5460(Context context, LocationManager locationManager) {
        this.f18002 = 5;
        this.f18000 = new C0203();
        this.f18001 = context;
        this.f17999 = locationManager;
    }

    public C5460(Context context) {
        this.f18002 = 8;
        this.f18001 = context;
        this.f17999 = new C4441(new long[]{-4865606401194734605L, -7743876034937572526L, 8426744100501283132L}).toString();
        this.f18000 = new C2432(new C0463(14, this));
    }

    public C5460(C4879 c4879, C5460 c5460) {
        this.f18002 = 6;
        this.f18001 = c4879;
        this.f17999 = c5460;
        this.f18000 = c4879.f16042;
    }
}
