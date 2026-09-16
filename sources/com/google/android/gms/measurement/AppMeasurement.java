package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.AbstractC0487;
import p000.AbstractC1434;
import p000.AbstractC5004;
import p000.C0325;
import p000.C1302;
import p000.C2028;
import p000.C5371;
import p000.InterfaceC0550;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: ۥۗ */
    public static volatile AppMeasurement f302;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC5004 f303;

    /* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    public AppMeasurement(C5371 c5371) {
        this.f303 = new C2028(c5371);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f302 == null) {
            synchronized (AppMeasurement.class) {
                if (f302 == null) {
                    InterfaceC0550 interfaceC0550 = (InterfaceC0550) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC0550 != null) {
                        f302 = new AppMeasurement(interfaceC0550);
                    } else {
                        f302 = new AppMeasurement(C5371.m9019(context, new C1302(0L, 0L, true, null, null), null, null));
                    }
                }
            }
        }
        return f302;
    }

    public void beginAdUnitExposure(String str) {
        this.f303.mo740(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f303.mo733(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f303.mo738(str);
    }

    public long generateEventId() {
        return this.f303.mo728();
    }

    public String getAppInstanceId() {
        return this.f303.mo736();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listMo739 = this.f303.mo739(str, str2);
        ArrayList arrayList = new ArrayList(listMo739 == null ? 0 : listMo739.size());
        for (Bundle bundle : listMo739) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            AbstractC0487.m1047(bundle);
            conditionalUserProperty.mAppId = (String) AbstractC1434.m3062(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) AbstractC1434.m3062(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) AbstractC1434.m3062(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = AbstractC1434.m3062(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) AbstractC1434.m3062(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) AbstractC1434.m3062(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) AbstractC1434.m3062(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) AbstractC1434.m3062(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) AbstractC1434.m3062(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) AbstractC1434.m3062(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) AbstractC1434.m3062(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) AbstractC1434.m3062(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) AbstractC1434.m3062(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) AbstractC1434.m3062(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) AbstractC1434.m3062(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) AbstractC1434.m3062(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f303.mo730();
    }

    public String getCurrentScreenName() {
        return this.f303.mo729();
    }

    public String getGmpAppId() {
        return this.f303.mo734();
    }

    public int getMaxUserProperties(String str) {
        return this.f303.mo737(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f303.mo735(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f303.mo731(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        AbstractC0487.m1047(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            AbstractC1434.m3060(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f303.mo732(bundle);
    }

    public AppMeasurement(InterfaceC0550 interfaceC0550) {
        this.f303 = new C0325(interfaceC0550);
    }
}
