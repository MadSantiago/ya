package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: renamed from: ۥٛؔٞٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1770 extends AbstractRunnableC2435 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f5899;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Object f5900;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ Object f5901;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ Object f5902;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770(C3183 c3183, Activity activity, BinderC0902 binderC0902) {
        super((C3286) c3183.f10690, true);
        this.f5899 = 3;
        this.f5901 = activity;
        this.f5902 = binderC0902;
        this.f5900 = c3183;
    }

    @Override // p000.AbstractRunnableC2435
    /* JADX INFO: renamed from: ۥۗ */
    public void mo2714() {
        switch (this.f5899) {
            case 1:
                ((BinderC0902) this.f5902).mo1888(null);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // p000.AbstractRunnableC2435
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2528() {
        Boolean boolValueOf;
        Bundle bundle = null;
        InterfaceC5122 interfaceC5122AsInterface = null;
        switch (this.f5899) {
            case 0:
                try {
                    Context context = (Context) this.f5901;
                    AbstractC0487.m1047(context);
                    String strM7185 = AbstractC4009.m7185(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strM7185)) {
                        strM7185 = AbstractC4009.m7185(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strM7185);
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    C3286 c3286 = (C3286) this.f5900;
                    try {
                        interfaceC5122AsInterface = AbstractBinderC4421.asInterface(C2401.m4518(context, (boolValueOf == null || !boolValueOf.booleanValue()) != false ? C2401.f7992 : C2401.f7995, ModuleDescriptor.MODULE_ID).m4525("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (C2784 e) {
                        c3286.m6044(e, true, false);
                    }
                    c3286.f11010 = interfaceC5122AsInterface;
                    if (c3286.f11010 != null) {
                        int iM4522 = C2401.m4522(context, ModuleDescriptor.MODULE_ID);
                        int iM4523 = C2401.m4523(context, ModuleDescriptor.MODULE_ID, false);
                        int iMax = Math.max(iM4522, iM4523);
                        boolean z = Boolean.TRUE.equals(boolValueOf) || iM4523 < iM4522;
                        long j = iMax;
                        c3286.f11014 = j;
                        C1302 c1302 = new C1302(161000L, j, z, (Bundle) this.f5902, AbstractC4009.m7185(context));
                        byte b = c3286.f11014 >= 169;
                        InterfaceC5122 interfaceC5122 = c3286.f11010;
                        if (b != true) {
                            AbstractC0487.m1047(interfaceC5122);
                            interfaceC5122.initialize(new BinderC1409(context), c1302, this.f8107);
                        } else {
                            AbstractC0487.m1047(interfaceC5122);
                            interfaceC5122.initializeWithElapsedTime(new BinderC1409(context), c1302, this.f8107, this.f8106);
                        }
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e2) {
                    ((C3286) this.f5900).m6044(e2, true, false);
                    return;
                }
                break;
            case 1:
                InterfaceC5122 interfaceC5123 = ((C3286) this.f5900).f11010;
                AbstractC0487.m1047(interfaceC5123);
                interfaceC5123.getMaxUserProperties((String) this.f5901, (BinderC0902) this.f5902);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Bundle bundle2 = (Bundle) this.f5902;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                InterfaceC5122 interfaceC5124 = ((C3286) ((C3183) this.f5900).f10690).f11010;
                AbstractC0487.m1047(interfaceC5124);
                interfaceC5124.onActivityCreatedByScionActivityInfo(C3156.m5837((Activity) this.f5901), bundle, this.f8106);
                break;
            default:
                InterfaceC5122 interfaceC5125 = ((C3286) ((C3183) this.f5900).f10690).f11010;
                AbstractC0487.m1047(interfaceC5125);
                interfaceC5125.onActivitySaveInstanceStateByScionActivityInfo(C3156.m5837((Activity) this.f5901), (BinderC0902) this.f5902, this.f8106);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1770(C3286 c3286, Object obj, Object obj2, int i) {
        super(c3286, true);
        this.f5899 = i;
        this.f5901 = obj;
        this.f5902 = obj2;
        this.f5900 = c3286;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770(C3183 c3183, Bundle bundle, Activity activity) {
        super((C3286) c3183.f10690, true);
        this.f5899 = 2;
        this.f5902 = bundle;
        this.f5901 = activity;
        this.f5900 = c3183;
    }
}
