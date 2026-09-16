package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥًّؔۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0836 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f2981;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f2982;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ boolean f2983;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Object f2984;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f2985;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2986 = 0;

    public RunnableC0836(C5235 c5235, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f2981 = atomicReference;
        this.f2985 = str;
        this.f2982 = str2;
        this.f2983 = z;
        Objects.requireNonNull(c5235);
        this.f2984 = c5235;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0147 A[Catch: RuntimeException -> 0x00dc, TryCatch #1 {RuntimeException -> 0x00dc, blocks: (B:19:0x006c, B:50:0x00fc, B:52:0x0107, B:55:0x0114, B:57:0x011a, B:59:0x0134, B:62:0x0141, B:64:0x0147, B:67:0x015e, B:69:0x016d, B:68:0x0165, B:70:0x0180, B:72:0x0186, B:74:0x018c, B:76:0x0192, B:78:0x019a, B:80:0x01a2, B:82:0x01aa, B:84:0x01b0, B:85:0x01c2, B:23:0x008d, B:25:0x0093, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00ad, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:44:0x00df, B:46:0x00ed), top: B:95:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:66:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x015e A[Catch: RuntimeException -> 0x00dc, TryCatch #1 {RuntimeException -> 0x00dc, blocks: (B:19:0x006c, B:50:0x00fc, B:52:0x0107, B:55:0x0114, B:57:0x011a, B:59:0x0134, B:62:0x0141, B:64:0x0147, B:67:0x015e, B:69:0x016d, B:68:0x0165, B:70:0x0180, B:72:0x0186, B:74:0x018c, B:76:0x0192, B:78:0x019a, B:80:0x01a2, B:82:0x01aa, B:84:0x01b0, B:85:0x01c2, B:23:0x008d, B:25:0x0093, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00ad, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:44:0x00df, B:46:0x00ed), top: B:95:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0165 A[Catch: RuntimeException -> 0x00dc, TryCatch #1 {RuntimeException -> 0x00dc, blocks: (B:19:0x006c, B:50:0x00fc, B:52:0x0107, B:55:0x0114, B:57:0x011a, B:59:0x0134, B:62:0x0141, B:64:0x0147, B:67:0x015e, B:69:0x016d, B:68:0x0165, B:70:0x0180, B:72:0x0186, B:74:0x018c, B:76:0x0192, B:78:0x019a, B:80:0x01a2, B:82:0x01aa, B:84:0x01b0, B:85:0x01c2, B:23:0x008d, B:25:0x0093, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00ad, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:44:0x00df, B:46:0x00ed), top: B:95:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0180 A[Catch: RuntimeException -> 0x00dc, TryCatch #1 {RuntimeException -> 0x00dc, blocks: (B:19:0x006c, B:50:0x00fc, B:52:0x0107, B:55:0x0114, B:57:0x011a, B:59:0x0134, B:62:0x0141, B:64:0x0147, B:67:0x015e, B:69:0x016d, B:68:0x0165, B:70:0x0180, B:72:0x0186, B:74:0x018c, B:76:0x0192, B:78:0x019a, B:80:0x01a2, B:82:0x01aa, B:84:0x01b0, B:85:0x01c2, B:23:0x008d, B:25:0x0093, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00ad, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:44:0x00df, B:46:0x00ed), top: B:95:0x006c }] */
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
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundleM3243;
        String str;
        C5590 c5590;
        int i = this.f2986;
        boolean z = this.f2983;
        Object obj = this.f2982;
        Object obj2 = this.f2985;
        Object obj3 = this.f2981;
        Object obj4 = this.f2984;
        switch (i) {
            case 0:
                C5695 c5695M9028 = ((AppMeasurementDynamiteService) obj4).f309.m9028();
                c5695M9028.mo6517();
                c5695M9028.m7643();
                c5695M9028.m9509(new RunnableC4350(c5695M9028, (String) obj2, (String) obj, c5695M9028.m9517(false), this.f2983, (InterfaceC3838) obj3));
                break;
            case 1:
                C5695 c5695M9029 = ((C5371) ((C5235) obj4).f18660).m9028();
                c5695M9029.mo6517();
                c5695M9029.m7643();
                c5695M9029.m9509(new RunnableC4350(c5695M9029, (AtomicReference) obj3, (String) obj2, (String) obj, c5695M9029.m9517(false), this.f2983));
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5235 c5235 = (C5235) ((C3183) obj4).f10690;
                C5371 c5371 = (C5371) c5235.f18660;
                c5235.mo6517();
                C3743 c3743 = c5235.f17273;
                String str2 = (String) obj;
                Uri uri = (Uri) obj3;
                try {
                    C1512 c1512 = c5371.f17721;
                    C3610 c3610 = c5371.f17717;
                    C5371.m9021(c1512);
                    String str3 = "utm_medium";
                    if (TextUtils.isEmpty(str2)) {
                        bundleM3243 = null;
                    } else if (str2.contains("gclid") || str2.contains("gbraid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id")) {
                        bundleM3243 = c1512.m3243(Uri.parse("https://google.com/search?".concat(str2)));
                        if (bundleM3243 != null) {
                            bundleM3243.putString("_cis", "referrer");
                        }
                    } else {
                        C3610 c3611 = ((C5371) c1512.f18660).f17717;
                        C5371.m9020(c3611);
                        c3611.f12015.m9432("Activity created with data 'referrer' without required params");
                        bundleM3243 = null;
                    }
                    String str4 = (String) obj2;
                    if (z) {
                        str = "Activity created with data 'referrer' without required params";
                        C1512 c1513 = c5371.f17721;
                        C5371.m9021(c1513);
                        Bundle bundleM3244 = c1513.m3243(uri);
                        if (bundleM3244 != null) {
                            bundleM3244.putString("_cis", "intent");
                            if (!bundleM3244.containsKey("gclid") && bundleM3243 != null && bundleM3243.containsKey("gclid")) {
                                bundleM3244.putString("_cer", "gclid=" + bundleM3243.getString("gclid"));
                            }
                            c5235.m8879(str4, "_cmp", bundleM3244);
                            c3743.m6585(str4, bundleM3244);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            C5371.m9020(c3610);
                            c5590 = c3610.f12015;
                            c5590.m9430(str2, "Activity created with referrer");
                            if (!c5371.f17715.m1162(null, AbstractC4936.f16325)) {
                                if (bundleM3243 != null) {
                                    c5235.m8879(str4, "_cmp", bundleM3243);
                                    c3743.m6585(str4, bundleM3243);
                                } else {
                                    C5371.m9020(c3610);
                                    c5590.m9430(str2, "Referrer does not contain valid parameters");
                                }
                                c5371.f17719.getClass();
                                c5235.m8863("auto", "_ldl", null, true, System.currentTimeMillis());
                            } else if (str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains(str3) && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                                C5371.m9020(c3610);
                                c5590.m9432(str);
                            } else if (!TextUtils.isEmpty(str2)) {
                                c5371.f17719.getClass();
                                c5235.m8863("auto", "_ldl", str2, true, System.currentTimeMillis());
                            }
                        }
                    } else {
                        str = "Activity created with data 'referrer' without required params";
                    }
                    str3 = "utm_medium";
                    if (!TextUtils.isEmpty(str2)) {
                        C5371.m9020(c3610);
                        c5590 = c3610.f12015;
                        c5590.m9430(str2, "Activity created with referrer");
                        if (!c5371.f17715.m1162(null, AbstractC4936.f16325)) {
                            if (str2.contains("gclid")) {
                            }
                            C5371.m9020(c3610);
                            c5590.m9432(str);
                        } else {
                            if (bundleM3243 != null) {
                                c5235.m8879(str4, "_cmp", bundleM3243);
                                c3743.m6585(str4, bundleM3243);
                            } else {
                                C5371.m9020(c3610);
                                c5590.m9430(str2, "Referrer does not contain valid parameters");
                            }
                            c5371.f17719.getClass();
                            c5235.m8863("auto", "_ldl", null, true, System.currentTimeMillis());
                        }
                    }
                } catch (RuntimeException e) {
                    C3610 c3612 = ((C5371) c5235.f18660).f17717;
                    C5371.m9020(c3612);
                    c3612.f12020.m9430(e, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
                break;
            default:
                C5695 c5695 = (C5695) obj4;
                InterfaceC5253 interfaceC5253 = c5695.f18733;
                C5371 c5372 = (C5371) c5695.f18660;
                if (interfaceC5253 == null) {
                    C3610 c3613 = c5372.f17717;
                    C5371.m9020(c3613);
                    c3613.f12020.m9432("Failed to send default event parameters to service");
                } else {
                    C5855 c5855 = (C5855) obj3;
                    if (c5372.f17715.m1162(null, AbstractC4936.f19569)) {
                        c5695.m9513(interfaceC5253, z ? null : (C5645) obj2, c5855);
                    } else {
                        try {
                            interfaceC5253.mo6908((Bundle) obj, c5855);
                            c5695.m9520();
                        } catch (RemoteException e2) {
                            C3610 c3614 = c5372.f17717;
                            C5371.m9020(c3614);
                            c3614.f12020.m9430(e2, "Failed to send default event parameters to service");
                        }
                    }
                }
                break;
        }
    }

    public RunnableC0836(C3183 c3183, boolean z, Uri uri, String str, String str2) {
        this.f2983 = z;
        this.f2981 = uri;
        this.f2985 = str;
        this.f2982 = str2;
        this.f2984 = c3183;
    }

    public RunnableC0836(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3838 interfaceC3838, String str, String str2, boolean z) {
        this.f2981 = interfaceC3838;
        this.f2985 = str;
        this.f2982 = str2;
        this.f2983 = z;
        this.f2984 = appMeasurementDynamiteService;
    }

    public RunnableC0836(C5695 c5695, C5855 c5855, boolean z, C5645 c5645, Bundle bundle) {
        this.f2981 = c5855;
        this.f2983 = z;
        this.f2985 = c5645;
        this.f2982 = bundle;
        Objects.requireNonNull(c5695);
        this.f2984 = c5695;
    }
}
