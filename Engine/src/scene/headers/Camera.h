#include "BaseModel.h"
#include "Transformable.h"
#ifndef _H_CAMERA_H_
#define _H_CAMERA_H_
namespace Engine {

    //Defines the Depth techiques for the camera to use
    enum CameraDepthMode{perspective, orthographic};

	class Camera : public Engine::BaseModel,
		public Engine::Transformable
	{
		public:
			Camera() {};
			~Camera() {};

            bool LookAt(glm::vec3 pos);
            bool LookAt(float x, float y, float z);

            ///sets///
			//only returns if the function has worked not active
            bool setActive(bool active){ Active=active; return true;}

            //sets how the z co-ordinate should be interpreted
            bool setDepthMode(CameraDepthMode Mode);

            ///gets///
            bool getActive(){ return Active;}

            CameraDepthMode getDepthMode(){return DepthMode;}

		private:
            CameraDepthMode DepthMode;

		    bool Active
	};

}
#endif
